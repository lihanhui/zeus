package io.zeus.token;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.RSADecrypter;
import com.nimbusds.jose.crypto.RSAEncrypter;
import com.nimbusds.jwt.EncryptedJWT;
import com.nimbusds.jwt.JWTClaimsSet;

import io.doraemon.logging.Logger;
import io.doraemon.logging.LoggerFactory;
import io.doraemon.restful.ResultMsg;
import io.doraemon.uuid.UUID;
import io.zeus.token.AccessToken.Builder;

public class AccessToken {
	private static Logger logger = LoggerFactory.getLogger(AccessToken.class);
	private JWEHeader header;
	private JWTClaimsSet jwtClaims;
	private String token;
	private AccessToken(JWEHeader header, JWTClaimsSet jwtClaims, String token){
		this.header = header;
		this.jwtClaims = jwtClaims;
		this.token = token;
	}
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getIssueDate(){
		return jwtClaims.getIssueTime() != null ? jwtClaims.getIssueTime().getTime(): null;
	}
	
	public Long getExpireDate(){
		return jwtClaims.getExpirationTime() != null ? jwtClaims.getExpirationTime().getTime(): null;
	}
	
	public String getUserId(){
		return jwtClaims.getSubject() != null ? jwtClaims.getSubject(): null;
	}
	
	public String getClientId(){
		return jwtClaims.getJWTID() != null ? jwtClaims.getJWTID(): null;
	}
	
	public String getIssuer(){
		return jwtClaims.getIssuer() != null ? jwtClaims.getIssuer(): null;
	}
	private JWEHeader getHeader(){
		return header;
	}
	private JWTClaimsSet getClaims(){
		return jwtClaims;
	}
	
	/*public static String encode(AccessToken accessToken){
		//System.out.println(accessToken);
		EncryptedJWT jwt = new EncryptedJWT(accessToken.getHeader(), accessToken.getClaims());
		//System.out.println(jwt);
		//System.out.println(RSAConfig.rsaPublicKey);
		RSAEncrypter encrypter = new RSAEncrypter(RSAConfig.rsaPublicKey);
		try {
			//System.out.println(encrypter);
			jwt.encrypt(encrypter);
			accessToken.setToken(jwt.serialize());
			return accessToken.getToken();
		} catch (JOSEException e) {
			logger.warn("can not encrypt token {} with {}", accessToken, e);
		}
		return null;
	}//*/
	public static AccessToken createAccessToken(String clientId, String userId, Long expireDate){
		Builder b = new Builder();
		b.clientId(clientId);
		b.expireDate(expireDate);
		b.issueDate(System.currentTimeMillis());
		b.issuer("l.zeus.io");
		b.userId(userId);
		return b.build();
	} 
	public static AccessToken decode(HttpServletRequest request){
		String auth = request.getHeader("Authorization");
	    if(auth == null){
	    	logger.info("can not get Authorization header from the request");
	    	return null;
	    }
	    auth.trim();
	    String token = auth.substring("Bearer ".length());
    	try {
			return AccessToken.decode(token);
		} catch (Exception e) {
			logger.info("can not decode token from request", e);
		}
		return null;
	    
	}
	public static String getAccessToken(HttpServletRequest request){
		String auth = request.getHeader("Authorization");
	    if(auth == null){
	    	logger.info("can not get Authorization header from the request");
	    	return null;
	    }
	    auth.trim();
	    return auth.substring("Bearer ".length());
	}
	public static AccessToken decode(String token) {
		RSADecrypter decrypter = new RSADecrypter(RSAConfig.rsaPrivateKey);
		try {
			EncryptedJWT jwt = EncryptedJWT.parse(token);
			jwt.decrypt(decrypter);
			JWTClaimsSet jwtClaims = jwt.getJWTClaimsSet();
			return new AccessToken(jwt.getHeader(), jwtClaims, token);
		} catch (JOSEException | ParseException e) {
			logger.warn("can not encrypt token {} with {}", token, e);
			//throw new Exception("can not decode token "+token, e);
			return null;
		}
		
	}
	
	public static class Builder {
		com.nimbusds.jwt.JWTClaimsSet.Builder b = new com.nimbusds.jwt.JWTClaimsSet.Builder();
		JWEHeader.Builder headerBuilder = new JWEHeader.Builder(JWEAlgorithm.RSA1_5, EncryptionMethod.A128GCM);
		
		public Builder() {
		}
		public Builder issuer(final String iss) {
			b.issuer(iss);
			return this;
		}
		public Builder userId(final String sub) {
			b.subject(sub);
			return this;
		}
		public Builder audience(final List<String> aud) {
			b.audience(aud);
			return this;
		}
		public Builder audience(final String aud) {
			b.audience(aud);
			return this;
		}

		public Builder expireDate(final Long exp) {
			b.expirationTime(new Date(exp));
			return this;
		}

		public Builder notBeforeDate(final Long nbf) {
			b.notBeforeTime(new Date(nbf));
			return this;
		}

		public Builder issueDate(final Long iat) {
			b.issueTime(new Date(iat));
			return this;
		}

		public Builder clientId(final String jti) {
			b.jwtID(jti);
			return this;
		}

		public Builder claim(final String name, final Object value) {
			b.claim(name, value);
			return this;
		}
		public AccessToken build() {
			JWTClaimsSet jwtClaims = b.build();
			EncryptedJWT jwt = new EncryptedJWT(headerBuilder.build(), jwtClaims);
			RSAEncrypter encrypter = new RSAEncrypter(RSAConfig.rsaPublicKey);
			try {
				jwt.encrypt(encrypter);
				return new AccessToken(headerBuilder.build(), jwtClaims, jwt.serialize());
			} catch (JOSEException e) {
				logger.warn("can not encrypt token with {}", e);
			}
			return null;
		}
	}
	public static void main(String[] args){
		RSAConfig.main(args);
		System.out.println(args);
		Builder b = new Builder();
		b.clientId(UUID.uuid());
		b.expireDate(System.currentTimeMillis()+1000*86400);
		b.issueDate(System.currentTimeMillis());
		b.issuer("l.zeus.io");
		b.userId("1234567");
		System.out.println(b);
		AccessToken token = b.build();
		System.out.println(token);
		//String t = AccessToken.encode(token);
		//System.out.println(t);
	}
}

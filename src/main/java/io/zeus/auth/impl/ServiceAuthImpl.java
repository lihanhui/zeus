package io.zeus.auth.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.crypto.RSAEncrypter;
import com.nimbusds.jwt.EncryptedJWT;

import io.doraemon.conf.Config;
import io.doraemon.logging.Logger;
import io.doraemon.logging.LoggerFactory;
import io.zeus.auth.IServiceAuth;
import io.zeus.auth.conf.ServiceAuthConf;
import io.zeus.token.AccessToken;
import io.zeus.token.RSAConfig;

@Component
@ConditionalOnProperty(name="zeus.authorization.mode", havingValue="true")
public class ServiceAuthImpl implements IServiceAuth {
	private static final Long NINTY_SECONDS = 90 * 1000L;
	private static String DEFAULT_SERVICE_AUTH_HEADER = "X-Service-Authorization";
	private static Logger logger = LoggerFactory.getLogger(AccessToken.class);
	private AccessToken accessToken;
	private String serviceAuthHeader = DEFAULT_SERVICE_AUTH_HEADER;
	public ServiceAuthImpl(){
		logger.info("to create IServiceAuth bean for authentication between services");
		ServiceAuthConf conf = ServiceAuthConf.getConf();
		if(conf.getServiceAuthHeader() != null)  serviceAuthHeader = conf.getServiceAuthHeader();
		this.accessToken = AccessToken.createAccessToken(conf.getClientId(), conf.getUserId(), 
				System.currentTimeMillis()+conf.getExpireInterval()*60*1000);
	}
	@Override
	public String getAccessToken() {
		AccessToken accessToken = this.accessToken;
		if(accessToken.getExpireDate() - System.currentTimeMillis() < NINTY_SECONDS){
			ServiceAuthConf conf = ServiceAuthConf.getConf();
			accessToken = AccessToken.createAccessToken(conf.getClientId(), conf.getUserId(), 
					System.currentTimeMillis()+conf.getExpireInterval()*60*1000);
			this.accessToken = accessToken;
		}
		return accessToken.getToken();
	}

	@Override
	public AccessToken decode(HttpServletRequest request) {
		String token = getAccessToken(request);
		return token != null ? AccessToken.decode(token) : null;
	}

	@Override
	public AccessToken decode(String token) {
		return AccessToken.decode(token);
	}
    
	private String getAccessToken(HttpServletRequest request) {
		String auth = request.getHeader(this.serviceAuthHeader);
	    if(auth == null){
	    	logger.info("can not get %s header from the request", this.serviceAuthHeader);
	    	return null;
	    }
	    auth.trim();
	    return auth.substring("Bearer ".length());
	}

	@Override
	public Boolean auth(AccessToken accessToken) {
		if(accessToken == null) return false;
		long expireDate = accessToken.getExpireDate();
		long now = System.currentTimeMillis();
		if(expireDate < now){
			return false;
		}
		long userId = Long.valueOf(accessToken.getUserId());
		if(userId >= -1){
			return false;
		}
		return true;
	}

	@Override
	public Boolean auth(String token) {
		AccessToken accessToken = this.decode(token);
		return auth(accessToken);
	}

	@Override
	public Boolean auth(HttpServletRequest request) {
		AccessToken accessToken = this.decode(request);
		return auth(accessToken);
	}
	public static void main(String argv[]){
		Config.init("d:\\");
		ServiceAuthConf.init("service-auth.conf");
		try {
			RSAConfig.init("token.conf");
		} catch (Exception e) {
			logger.info("can not read token config from", e);
		}
		ServiceAuthImpl impl = new ServiceAuthImpl();
	}
}

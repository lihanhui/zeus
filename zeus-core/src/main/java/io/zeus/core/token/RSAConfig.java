package io.zeus.core.token;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64.Decoder;

import io.doraemon.conf.Config;
import io.doraemon.exception.DoraemonRuntimeException;
import io.doraemon.logging.Logger;
import io.doraemon.logging.LoggerFactory;

public class RSAConfig {
	private static Logger logger = LoggerFactory.getLogger(RSAConfig.class);
	private RSAPublicKey publicKey;
	private RSAPrivateKey privateKey;
	private String rsaPublicKeyFile;
	private String rsaPrivateKeyFile;
	
	private void load() {
		try {
			loadPublicKey(rsaPublicKeyFile);
			loadPrivateKey(rsaPrivateKeyFile);
		} catch (Exception e) {
			throw new DoraemonRuntimeException(e);
		}
		
	}
	private static RSAConfig config;
	public static RSAConfig getConfig(){
		return config;
	}
	
	public RSAPublicKey getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(RSAPublicKey publicKey) {
		this.publicKey = publicKey;
	}

	public RSAPrivateKey getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(RSAPrivateKey privateKey) {
		this.privateKey = privateKey;
	}

	private void loadPublicKey(String publicKeyFile) throws Exception{
		try {
			BufferedReader br= new BufferedReader(
					new InputStreamReader(new FileInputStream(publicKeyFile)));
			String readLine= null;
			StringBuilder sb= new StringBuilder();
			while((readLine= br.readLine())!=null){
				if(readLine.charAt(0)=='-'){
					continue;
				}else{
					sb.append(readLine);
					sb.append('\r');
				}
			}
			publicKey = toPublicKey(sb.toString());
		} catch (IOException |NullPointerException e) {
			logger.info("can not load public key", e);
			throw new Exception("can not load public key",e);
		} 
	}
 
 
	/**
	 * 从字符串中加载公钥
	 * @param publicKeyStr 公钥数据字符串
	 * @throws Exception 加载公钥时产生的异常
	 */
	private RSAPublicKey toPublicKey(String publicKeyStr) throws Exception{
		try {
			Decoder base64Decoder= java.util.Base64.getMimeDecoder();
			byte[] buffer= base64Decoder.decode(publicKeyStr);
			KeyFactory keyFactory= KeyFactory.getInstance("RSA");
			X509EncodedKeySpec keySpec= new X509EncodedKeySpec(buffer);
			return (RSAPublicKey) keyFactory.generatePublic(keySpec);
		} catch (NoSuchAlgorithmException|InvalidKeySpecException|NullPointerException e) {
			logger.info("can not generate public key", e);
			throw new Exception("can not generate public key",e);
		} 
	}
 
	/**
	 * 从文件中加载私钥
	 * @param keyFileName 私钥文件名
	 * @return 是否成功
	 * @throws Exception 
	 */
	private void loadPrivateKey(String privateKeyFile) throws Exception{
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream(privateKeyFile)));
			String readLine= null;
			StringBuilder sb= new StringBuilder();
			while((readLine= br.readLine())!=null){
				if(readLine.charAt(0)=='-'){
					continue;
				}else{
					sb.append(readLine);
					//sb.append('\r');
				}
			}
			String str = sb.toString();
			str = str.replace("\r\n", "");
			privateKey = toPrivateKey(str);
		} catch (IOException |NullPointerException e) {
			logger.info("can not load private key", e);
			throw new Exception("can not load private key",e);
		} 
	}
 
	private RSAPrivateKey toPrivateKey(String privateKeyStr) throws Exception{
		try {
			Decoder base64Decoder= java.util.Base64.getDecoder();
			byte[] buffer= base64Decoder.decode(privateKeyStr);
			PKCS8EncodedKeySpec keySpec= new PKCS8EncodedKeySpec(buffer);
			KeyFactory keyFactory= KeyFactory.getInstance("RSA");
			return (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
		} catch (NoSuchAlgorithmException|InvalidKeySpecException|NullPointerException e) {
			logger.info("can not generatre private key", e);
			throw new Exception("can not generatre private key",e);
		}
	}
	public static void init() throws Exception{
		config = Config.getConfig().readConf("rsa.conf", RSAConfig.class);
		config.load();
	}
	
	public static void init(String confFile) throws Exception{
		config = Config.getConfig().readConf(confFile, RSAConfig.class);
		config.load();
	}
	
	public static void main(String[] args){
		//加载公钥
		try {
			Config.init("/Users/lihanhui/work-banma/etc/conf");
			init("/rsa.conf");
			System.out.println("加载秘钥成功");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("加载秘钥失败");
		}
	}
}

package io.zeus.token;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import io.doraemon.conf.Config;
import io.doraemon.logging.Logger;
import io.doraemon.logging.LoggerFactory;
import sun.misc.BASE64Decoder;

public class RSAConfig {
	private static Logger logger = LoggerFactory.getLogger(RSAConfig.class);
	public static RSAPublicKey rsaPublicKey;
	public static RSAPrivateKey rsaPrivateKey;
	private String rsaPublicKeyFile;
	private String rsaPrivateKeyFile;
	
	private RSAConfig(String rsaPublicKeyFile, String rsaPrivateKeyFile) {
		super();
		this.rsaPublicKeyFile = rsaPublicKeyFile;
		this.rsaPrivateKeyFile = rsaPrivateKeyFile;
	}
	private static RSAConfig config;
	public static RSAConfig getConfig(){
		return config;
	}

	public static void loadPublicKey(String publicKeyFile) throws Exception{
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
			rsaPublicKey = toPublicKey(sb.toString());
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
	public static RSAPublicKey toPublicKey(String publicKeyStr) throws Exception{
		try {
			BASE64Decoder base64Decoder= new BASE64Decoder();
			byte[] buffer= base64Decoder.decodeBuffer(publicKeyStr);
			KeyFactory keyFactory= KeyFactory.getInstance("RSA");
			X509EncodedKeySpec keySpec= new X509EncodedKeySpec(buffer);
			return (RSAPublicKey) keyFactory.generatePublic(keySpec);
		} catch (NoSuchAlgorithmException|InvalidKeySpecException|IOException|NullPointerException e) {
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
	public static void loadPrivateKey(String privateKeyFile) throws Exception{
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream(privateKeyFile)));
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
			rsaPrivateKey = toPrivateKey(sb.toString());
		} catch (IOException |NullPointerException e) {
			logger.info("can not load private key", e);
			throw new Exception("can not load private key",e);
		} 
	}
 
	public static RSAPrivateKey toPrivateKey(String privateKeyStr) throws Exception{
		try {
			BASE64Decoder base64Decoder= new BASE64Decoder();
			byte[] buffer= base64Decoder.decodeBuffer(privateKeyStr);
			PKCS8EncodedKeySpec keySpec= new PKCS8EncodedKeySpec(buffer);
			KeyFactory keyFactory= KeyFactory.getInstance("RSA");
			return (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
		} catch (NoSuchAlgorithmException|InvalidKeySpecException|IOException|NullPointerException e) {
			logger.info("can not generatre private key", e);
			throw new Exception("can not generatre private key",e);
		}
	}
	public static void init() throws Exception{
		config = Config.getConfig().readConf("token.conf", RSAConfig.class);
		RSAConfig.loadPublicKey(config.rsaPublicKeyFile);
		RSAConfig.loadPrivateKey(config.rsaPrivateKeyFile);
	}
	
	public static void init(String confFile) throws Exception{
		config = Config.getConfig().readConf(confFile, RSAConfig.class);
		RSAConfig.loadPublicKey(config.rsaPublicKeyFile);
		RSAConfig.loadPrivateKey(config.rsaPrivateKeyFile);
	}
	
	public static void main(String[] args){
		//加载公钥
		try {
			RSAConfig.loadPublicKey("d:\\public.key");
			System.out.println("加载公钥成功");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("加载公钥失败");
		}
 
		//加载私钥
		try {
			RSAConfig.loadPrivateKey("d:\\pkcs8_rsa_private.key");
			System.out.println("加载私钥成功");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("加载私钥失败");
		}
 
	}
}

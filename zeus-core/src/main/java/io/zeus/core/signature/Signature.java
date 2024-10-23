package io.zeus.core.signature;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import io.doraemon.logging.Logger;
import io.doraemon.logging.LoggerFactory;

public class Signature {
	private static Logger logger = LoggerFactory.getLogger(Signature.class);
	private static Map<String, Class<? extends ISignature>> signatures = new ConcurrentHashMap<>();
	static {
		signatures.put("basic", SimpleSignature.class);
	}
	
	public static ISignature sign(String signAlgorithm, String signature, String accessToken) {
		if(!signatures.containsKey(signAlgorithm)){
			return null;
		}
		try {
			return signatures.get(signAlgorithm).getDeclaredConstructor().newInstance().sign(signature, accessToken);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			logger.info("exception on checking signature", e);
		}
		return null;
	}
	public Signature(){
	}
}

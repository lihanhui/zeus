package io.zeus.signature;

import java.util.HashMap;
import java.util.Map;

import io.doraemon.md5.MD5;

public class SimpleSignature implements ISignature{
	public static String ALGORITHM = "default";
	private HashMap<String, String> map = new HashMap<>();
	public SimpleSignature() {
		super();
	}
	
	private void parse(String authentication){
		String[] strs = authentication.split("&");
		for(String str: strs){
			int index = str.indexOf("=");
			if(index >= 0){
				String key = str.substring(0, index);
				String value = str.substring(index+1);
				map.put(key, value);
			}
		}
	}
	private Boolean sign(Map<String, String> map){
		if(!map.containsKey("sign") 
				|| !map.containsKey("productId")
				|| !map.containsKey("version")
				|| !map.containsKey("accessToken")
				|| !map.containsKey("uuid")
				|| !map.containsKey("userId")
				|| !map.containsKey("timestamp")){
			return false;
		}
		String md5 = MD5.digest(map.get("productId")
				+map.get("version")
				+map.get("accessToken")
				+map.get("uuid")
				+map.get("userId")
				+map.get("timestamp"));
		if(!md5.equals(map.get("sign"))){
			return false;
		}
		return true;
	}
	@Override
	public ISignature sign(String signature, String accessToken) {
		parse(signature);
		map.put("accessToken", accessToken);
		return this;
	}

	@Override
	public Map<String, String> getAttributes() {
		return map;
	}

	@Override
	public String getAttribute(String key) {
		return map.get(key);
	}

	@Override
	public Boolean isSignOk() {
		return sign(map);
	}
}

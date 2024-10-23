package io.zeus.core.signature;

import java.util.HashMap;
import java.util.Map;

import io.doraemon.md5.MD5;

public class SimpleSignature implements ISignature{
	public static String ALGORITHM = "basic";
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
	public static void main(String[] args){
		SimpleSignature sign = new SimpleSignature();
		sign.sign("productId=saas-web&version=1.0.0&uuid=78c66c7a844534ffb6e83999eb2a39fe&userId=611a139054685e8ad45c469c&timestamp=1635474737000&sign=e020c77a4847d80f5b955961fddf34a0", 
				"eyJlbmMiOiJBMTI4R0NNIiwiYWxnIjoiUlNBMV81In0.xWnoVLbJtHojlUYb_fOQYlILpuiNSbM8jZscgnBh5DtJKNWEgaXvOgFxKVAjw4Su2K9KrSb5gIb3-9HYxbrdGevI62_DIsCbzk2xexjDvwMqSDeJXMZjtl8sBNC49sL8YpvbQju4G8WBxeRIV57yvF-c0afj_L0qlh_oeu8TRhY.lptJSVfpckAzIWmo.irqZvTKkXmfemvN2q4OPdNgcjw4LqgXx44NTY1prTKGwJjBrqIaGX5lUAiPGCPUlZzsGy4L72sEdBQX1YMeKpM7NqGGdxAzp2QzsCIvja5qGl904rh0.1ue3yJkalQufAP7sVCkpVw");
		sign.isSignOk();
	}
}

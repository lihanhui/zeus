package io.zeus.core.signature;

import java.util.Map;

public interface ISignature {
	public ISignature sign(String signature, String accessToken);
	public Map<String, String> getAttributes();
	public String getAttribute(String key);
	public Boolean isSignOk();
}

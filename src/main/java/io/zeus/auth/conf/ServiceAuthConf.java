package io.zeus.auth.conf;

import io.doraemon.conf.Config;

public class ServiceAuthConf {
	private Boolean authMode;
	private String userId;
	private String clientId;
	private Long expireInterval; // unit: minute
	private static ServiceAuthConf conf;
	
	public static ServiceAuthConf getConf(){
		return conf;
	}
    public static void init(String file){
    	conf = Config.getConfig().readConf(file, ServiceAuthConf.class);
    	if(conf.getAuthMode() != null && conf.getAuthMode()){
    		System.setProperty("zeus.authorization.mode", "true");
    	}
    }
    
	public Boolean getAuthMode() {
		return authMode;
	}
	public void setAuthMode(Boolean authMode) {
		this.authMode = authMode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public Long getExpireInterval() {
		return expireInterval;
	}
	public void setExpireInterval(Long expireInterval) {
		this.expireInterval = expireInterval;
	}
	@Override
	public String toString() {
		return "ServiceConf [userId=" + userId + ", clientId=" + clientId + ", expireInterval=" + expireInterval + "]";
	}
	public ServiceAuthConf(String userId, String clientId, Long expireInterval) {
		super();
		this.userId = userId;
		this.clientId = clientId;
		this.expireInterval = expireInterval;
	}
	public ServiceAuthConf() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

package io.zeus.auth.user;

import java.io.BufferedReader;
import java.io.IOException;

import org.springframework.lang.Nullable;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

import com.alibaba.fastjson.JSONObject;

import io.doraemon.logging.Logger;
import io.doraemon.logging.LoggerFactory;
import io.zeus.core.token.AccessToken;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AuthUserRestHandlerInterceptor extends WebRequestHandlerInterceptorAdapter{
	public AuthUserRestHandlerInterceptor(WebRequestInterceptor requestInterceptor) {
		super(requestInterceptor);
		// TODO Auto-generated constructor stub
	}

	static private Logger logger = LoggerFactory.getLogger(AuthUserRestHandlerInterceptor.class);
	
	private String getBody(HttpServletRequest request) {
		BufferedReader br;
		String str, wholeStr = "";
		try {
			br = request.getReader();
			while((str = br.readLine()) != null){
				wholeStr += str;
			}
		} catch (IOException e) {
			logger.warn("failed to read body", e);
		}
		return wholeStr;
	}
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
        //获取accessToken
        String token = this.getToken(request);
        if (token == null) {
            //throw RuntimeException;
        }
        AccessToken accessToken = AccessToken.decode(token);
	    if(accessToken == null){
	    		logger.info("can not get/parse Authorization header for the request");
	    		return false;
	    }
	    
		if(accessToken.getExpireDate() < System.currentTimeMillis()){
			logger.info("expired Token for user uuid {} userid {} token {}", accessToken.getClientId(), accessToken.getUserId(), token);
			return false;
		}
		if("GET".equals(request.getMethod())){ // this should be GET
			return true;
		}
		// check userId
		String userId = accessToken.getUserId();
		JSONObject json = JSONObject.parseObject(this.getBody(request));
		if(json == null) {
			return true;
		}
		Object userId2 = json.get("userId"); 
		if( userId2 instanceof Long
				|| userId2 instanceof String){
			if(!userId.equals(String.valueOf(userId2))){
				logger.info("user {} can not request other user {} private data", userId, userId2);
				return false;
			}
		}
		
		if(userId2 instanceof JSONObject){
			Object userId3 = ((JSONObject)userId2).get("userId");
			if(userId3 == null 
				|| !userId.equals(userId3)){
				logger.info("user {} can not request other user {} private data", userId, userId3);
				return false;
			}
		}
		return true; //ok
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response,
			Object handler)  {
	}
	
	private static String BEARER_ = "Bearer ";
	private String getToken(HttpServletRequest request) {
        String authorization = request.getHeader("Authorization");
        if(authorization == null || authorization.length() < BEARER_.length()) return null;
        return authorization.substring(BEARER_.length());
    }
}

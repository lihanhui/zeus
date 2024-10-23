package io.zeus.auth.service;

import java.io.BufferedReader;
import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import io.doraemon.logging.Logger;
import io.doraemon.logging.LoggerFactory;
import io.zeus.core.token.AccessToken;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthServiceRestHandlerInterceptor implements HandlerInterceptor{
	static private Logger logger = LoggerFactory.getLogger(AuthServiceRestHandlerInterceptor.class);
	
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
		return true; //ok
	}

	private static String BEARER_ = "Bearer ";
	private String getToken(HttpServletRequest request) {
        String authorization = request.getHeader("X-Authorization");
        if(authorization == null || authorization.length() < BEARER_.length()) return null;
        return authorization.substring(BEARER_.length());
    }
}

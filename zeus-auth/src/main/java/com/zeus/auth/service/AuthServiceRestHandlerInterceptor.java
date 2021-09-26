package com.zeus.auth.service;

import java.io.BufferedReader;
import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSONObject;

import io.doraemon.json.JsonUtil;
import io.doraemon.logging.Logger;
import io.doraemon.logging.LoggerFactory;
import io.doraemon.restful.ResultMsg;
import io.zeus.token.AccessToken;

public class AuthServiceRestHandlerInterceptor extends HandlerInterceptorAdapter{
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
			Object handler) throws Exception {
	}
	
	private static String BEARER_ = "Bearer ";
	private String getToken(HttpServletRequest request) {
        String authorization = request.getHeader("X-Authorization");
        if(authorization == null || authorization.length() < BEARER_.length()) return null;
        return authorization.substring(BEARER_.length());
    }
}

package io.zeus.auth;

import javax.servlet.http.HttpServletRequest;

import io.zeus.token.AccessToken;

public interface IUserAuth {
	String createAccessToken(String clientId, String userId, Long expireDate);
	AccessToken decode(HttpServletRequest request);
	AccessToken decode(String token);
	String getAccessToken(HttpServletRequest request);
}

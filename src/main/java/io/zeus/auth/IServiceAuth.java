package io.zeus.auth;

import javax.servlet.http.HttpServletRequest;

import io.zeus.token.AccessToken;

public interface IServiceAuth {
	String getAccessToken();
	AccessToken decode(HttpServletRequest request);
	AccessToken decode(String token);
	Boolean auth(AccessToken accessToken);
	Boolean auth(String token);
	Boolean auth(HttpServletRequest request);
}

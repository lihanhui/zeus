package io.zeus.auth;

import io.zeus.token.AccessToken;

public interface IServiceAuth {
	String getAccessToken();
	AccessToken decode(String token);
	Boolean auth(AccessToken accessToken);
	Boolean auth(String token);
}

package io.zeus.core.auth;

import io.zeus.core.token.AccessToken;

public interface IServiceAuth {
	String getAccessToken();
	AccessToken decode(String token);
	Boolean auth(AccessToken accessToken);
	Boolean auth(String token);
}

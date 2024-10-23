package io.zeus.core.auth;

import io.zeus.core.token.AccessToken;

public interface IUserAuth {
	String createAccessToken(String clientId, String userId, Long expireDate);
	AccessToken decode(String token);
}

package io.zeus.auth;

import io.zeus.token.AccessToken;

public interface IUserAuth {
	String createAccessToken(String clientId, String userId, Long expireDate);
	AccessToken decode(String token);
}

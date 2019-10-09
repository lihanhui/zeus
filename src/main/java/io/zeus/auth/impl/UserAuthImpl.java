package io.zeus.auth.impl;

import javax.servlet.http.HttpServletRequest;

import io.zeus.auth.IUserAuth;
import io.zeus.token.AccessToken;

public class UserAuthImpl implements IUserAuth {

	@Override
	public String createAccessToken(String clientId, String userId, Long expireDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccessToken decode(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccessToken decode(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAccessToken(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}

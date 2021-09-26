package com.zeus.auth.user;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AuthRestMethodInterceptor implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		AuthApi annotation = invocation.getMethod().getAnnotation(AuthApi.class);
        if (annotation == null) {
            annotation = invocation.getMethod().getDeclaringClass().getAnnotation(AuthApi.class);
        }
        /*if (annotation == null || annotation.enabled()) {
            if (ApiContextHolder.get().getPrincipal() == null) {
                throw new AuthorizationException();
            }
            if (!vcUserService.checkAccessToken(ApiContextHolder.get().getPrincipal().getId(), accessToken)) {
                throw new TokenInvalidException();
            }
        }//*/
        return invocation.proceed();
	}

}

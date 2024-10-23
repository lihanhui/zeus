package io.zeus.auth.service;

import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuthServiceConfiguration implements WebMvcConfigurer{
	@Bean
    public AuthServiceRestHandlerInterceptor authRestHandlerInterceptor() {
        return new AuthServiceRestHandlerInterceptor();
    }
    
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authRestHandlerInterceptor())//指定拦截器类
                .addPathPatterns("/**"); //指定该类拦截的url
    }
}

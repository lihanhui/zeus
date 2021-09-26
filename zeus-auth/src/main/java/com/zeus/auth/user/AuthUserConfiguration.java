package com.zeus.auth.user;

import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuthUserConfiguration implements WebMvcConfigurer{
	@Bean
    public AuthUserRestHandlerInterceptor authRestHandlerInterceptor() {
        return new AuthUserRestHandlerInterceptor();
    }
    @Bean
    public AuthRestMethodInterceptor getInterceptor(){
        return  new AuthRestMethodInterceptor();
    }
    
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authRestHandlerInterceptor())//指定拦截器类
                .addPathPatterns("/**"); //指定该类拦截的url
    }
    
    @Bean
    public DefaultPointcutAdvisor defaultPointcutAdvisor() {
        JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
        pointcut.setPattern("com.naolu.*.controller.*");
        // 配置增强类advisor
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setPointcut(pointcut);
        advisor.setAdvice(getInterceptor());

        return advisor;
    }
}

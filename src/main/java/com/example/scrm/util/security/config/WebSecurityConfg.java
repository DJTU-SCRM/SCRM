package com.example.scrm.util.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * TODO
 *
 * @author Steven
 * @version 1.0
 * @date 2021/10/4 9:35
 */
@Configuration
public class WebSecurityConfg extends WebSecurityConfigurerAdapter {
    @Autowired
    private AuthenticationSuccessHandler myLoginSuccessHandler;
    private AuthenticationFailureHandler myLoginFailureHandler;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/500").permitAll()
                .antMatchers("/403").permitAll()
                .antMatchers("/404").permitAll()
//                .antMatchers("/admin/index").hasRole("ADMIN")//指定权限为ADMIN才能访问
//                .antMatchers("/person").hasAnyRole("ADMIN","USER")//指定多个权限都能访问
//                .anyRequest() //任何其它请求
//                .authenticated() //都需要身份认证
                .and()
                .formLogin() //使用表单认证方式
                .loginProcessingUrl("/login")//配置默认登录入口
                .successHandler(myLoginSuccessHandler)//使用自定义的成功结果处理器
                .failureHandler(myLoginFailureHandler)//使用自定义失败的结果处理器
                .and()
                .csrf().disable();
    }
}

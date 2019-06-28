package com.hy.sample.admin.server.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * 有这个配置，http://localhost:9091/login.html后就能出现Admin的登录界面
	 * 若没有这个配置，显示的是浏览器自带的弹窗，比较丑
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin().loginPage("/login.html").loginProcessingUrl("/login").permitAll();
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/login.html","/**/**.css","/img/**","/third-party/**").permitAll();
		http.authorizeRequests().antMatchers("/**").authenticated();
		http.httpBasic();
	}
}

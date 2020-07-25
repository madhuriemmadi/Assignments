package com.example.springrest.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserDetailsService userDetailsService;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().
		antMatchers("/").hasAnyRole("USER","ADMIN")
		.antMatchers(HttpMethod.GET,"/students").hasAnyRole("USER")
		.antMatchers(HttpMethod.POST,"/student/**").hasAnyRole("ADMIN")
		.antMatchers(HttpMethod.GET,"/departments").hasAnyRole("USER")
		.antMatchers(HttpMethod.POST,"/department/**").hasAnyRole("ADMIN")
		.and()
		.csrf().disable().formLogin().disable();
		
	}

}

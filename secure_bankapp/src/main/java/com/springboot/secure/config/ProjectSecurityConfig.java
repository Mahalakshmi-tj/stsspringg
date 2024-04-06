package com.springboot.secure.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
import org.springframework.security.web.util.matcher.AndRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatchers;

@Configuration
public class ProjectSecurityConfig {

	
	@Bean
	SecurityFilterChain web(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/myAccount","myBalance","myLoans","myCards").authenticated());
		http.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/notices","contact").permitAll());
		//http.formLogin();
		//http.httpBasic();
		
	        // ...
		
	//deny all the request made--	
	//http.authorizeHttpRequests().anyRequest().denyAll().and().formLogin().and().httpBasic();

		return http.build();
		
		
		
	}

}

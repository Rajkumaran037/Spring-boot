package com.example.core.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	private UserDetailServiceImpl userDetailServiceImpl;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		System.out.println("SecurityFilterChain--->");
		return http.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(
						auth ->
						auth.antMatchers("/auth/**", "/h2-console/**", "/h2-console/login.do")
								.permitAll()
								.anyRequest()
								.authenticated())
				.httpBasic(https -> https.disable())
				.sessionManagement(s -> s.sessionCreationPolicy(SessionCreationPolicy.ALWAYS))
				.headers(h -> h.frameOptions().disable())
				.build();
	}

	// @Bean
	// public UserDetailsService userDetailsService() {
	// return userDetailsService.loadUserByUsername("");
	// UserDetails user1 = User.withDefaultPasswordEncoder().username("aaa").password("aaa").roles("USER").build();
	// InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user1);
	// return inMemoryUserDetailsManager;
	// }

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		System.out.println("BCryptPasswordEncoder");
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationProvider authenticationProvider() {
		System.out.println("AuthenticationProvider--->");
		DaoAuthenticationProvider dao = new DaoAuthenticationProvider();
		dao.setPasswordEncoder(new BCryptPasswordEncoder(12));
		dao.setUserDetailsService(userDetailServiceImpl);
		return dao;
	}
}

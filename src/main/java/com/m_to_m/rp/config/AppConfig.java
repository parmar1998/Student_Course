package com.m_to_m.rp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
	@Bean
	// this is used to load the user details or fetch the details
	public UserDetailsService detailsService() {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		// both are provided with admin rights
		// UserDetails is the one having all details of user
		UserDetails userDetails = User.builder().username("DURGESH").password(encoder.encode("DURGESH")).roles("ADMIN")
				.build();
		// we can pass multiple arguments as this is taking var argument
		return new InMemoryUserDetailsManager(userDetails);
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
		return builder.getAuthenticationManager();
	}
}

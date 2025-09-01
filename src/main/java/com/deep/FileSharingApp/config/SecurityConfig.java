package com.deep.FileSharingApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/api/v1/files","/api/v1/files/download/{id}","/api/v1/files/share/{id}","/styles/**").permitAll();
                    auth.anyRequest().authenticated();

                })
                .oauth2Login(oauth2Login -> oauth2Login
                        .loginPage("/api/v1/files") // Custom login page
                        .successHandler(customSuccessHandler())
                )
                .csrf(csrf -> csrf.disable()); // Disable CSRF for simplicity; use it in production.

        return http.build();
    }

    @Bean
    public AuthenticationSuccessHandler customSuccessHandler() {
        SimpleUrlAuthenticationSuccessHandler successHandler = new SimpleUrlAuthenticationSuccessHandler();
        successHandler.setDefaultTargetUrl("/api/v1/files/home"); // Redirect to this URL after successful login
        return successHandler;
    }

}

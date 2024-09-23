package com.lojavirtual.loja_virtual.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.http.HttpMethod;

@Configuration
@EnableWebSecurity
public class WebConfigSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers(HttpMethod.POST, "/salvarAcesso/**").permitAll() // Ignorar autenticação para esse endpoint
                                .anyRequest().authenticated() // Proteger todas as outras requisições
                )
                .csrf(csrf -> csrf.disable()); // Desabilitar CSRF, se necessário

        return http.build();
    }
}

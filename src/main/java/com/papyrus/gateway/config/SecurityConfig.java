//package com.papyrus.gateway.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.util.pattern.PathPatternParser;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        return http
//                .cors(Customizer.withDefaults())
//                .authorizeRequests(auth -> auth.anyRequest().authenticated())
//                .httpBasic(Customizer.withDefaults())
//                .build();
//    }
//
//    @Bean
//    CorsConfigurationSource corsConfigurationSource(){
//        CorsConfiguration corsConfig = new CorsConfiguration();
//		corsConfig.setAllowedOrigins(Arrays.asList("http://localhost:3000")); // 1
//		corsConfig.setMaxAge(3600L); // 2
//		corsConfig.setAllowedMethods(Arrays.asList("GET", "POST", "DELETE")); // 3
//		corsConfig.setAllowedHeaders(List.of("Access-Control-Allow-Origin")); // 4
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
//        source.registerCorsConfiguration("/**", corsConfig); // 5
//
//        return source;
//    }
//}

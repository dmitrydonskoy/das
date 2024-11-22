package com.example.reportService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOriginPattern("*");       // Разрешить все источники с учетом учетных данных
        config.addAllowedHeader("*");              // Разрешить все заголовки
        config.addAllowedMethod("*");              // Разрешить все методы (GET, POST, и т.д.)
        config.setAllowCredentials(true);          // Разрешить учетные данные (например, куки)

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }

}

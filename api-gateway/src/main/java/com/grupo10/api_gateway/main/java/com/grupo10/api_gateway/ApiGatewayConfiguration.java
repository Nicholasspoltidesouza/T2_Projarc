package com.grupo10.api_gateway.main.java.com.grupo10.api_gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
        @Bean
        public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
                return builder.routes()
                                .route(p -> p.path("/servcad/assinaturas/**")
                                                .uri("lb://cadastra-assinatura"))
                                .route(p -> p.path("/assinaturas")
                                                .filters(f -> f.circuitBreaker(c -> c
                                                                .setName("circuitbreaker_assinaturas")
                                                                .setFallbackUri("forward:/fallback/assinaturas")))
                                                .uri("lb://clean"))
                                .build();
        }
}

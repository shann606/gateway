package com.ecom.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class APIgatewayconfig {
	
	
	
	@Bean
	public RouteLocator localOrderoute(RouteLocatorBuilder builder) {
		// TODO Auto-generated method stub
		
		// need to add routes later.
		return builder.routes()
				       .route(r -> r.path("order-service","/api/v1/order/**" , "/api/v1/order/placeorder")
				       .filters(f -> f.addRequestHeader("orderservice", "yes"))
				        .uri("lb://orderservice") )
				        .build();

	}
	
	
	@Bean
	public RouteLocator localProductRoute(RouteLocatorBuilder builder) {
		// TODO Auto-generated method stub
		
		// need to add routes later.
		return builder.routes()
				       .route(r -> r.path("product-service","/api/v1/products/**")
				       .filters(f -> f.addRequestHeader("productservice", "yes"))
				        .uri("lb://productservice") )
				        .build();

	}
	
	
	@Bean
	public RouteLocator localCustomerRoute(RouteLocatorBuilder builder) {
		// TODO Auto-generated method stub
		
		// need to add routes later.
		return builder.routes()
				       .route(r -> r.path("product-service","/api/v1/customers/**")
				       .filters(f -> f.addRequestHeader("customerservice", "yes"))
				        .uri("lb://customerservice") )
				        .build();

	}
}

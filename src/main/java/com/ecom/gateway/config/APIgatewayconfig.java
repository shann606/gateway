package com.ecom.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class APIgatewayconfig {
	
	
	
	@Bean
	public RouteLocator localRoute(RouteLocatorBuilder builder) {
		// TODO Auto-generated method stub
		
		// need to add routes later.
		return builder.routes()
				
				.build();

	}
}

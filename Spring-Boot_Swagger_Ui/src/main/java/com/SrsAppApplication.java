package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title="Product API", version = "2.0", description = "This API is for Products"))
public class SrsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrsAppApplication.class, args);
		System.out.println("Spring-Boot Raw Product Application running on port No: 8585...");
	}

}
		/*
		 *  Steps:-
		 *  swagger: http://localhost:8585/product_info/v3/api-docs | Send all controller info
		 *  swagger-ui: http://localhost:8585/product_info/swagger-ui.html  |  redirect to swagger-ui
		 *  Refer: https://springdoc.org/
		 */

package com.scg.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication(scanBasePackages = { "com.scg.product" })
@EnableSwagger2
@EnableAutoConfiguration
public class ProductServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServicesApplication.class, args);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.scg.product.controller")).paths(PathSelectors.ant("/*"))
				.build().apiInfo(apiInfo());
	
	}

	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {

		return new ApiInfo("PRODUCT MANAGEMENT", "PRODUCT SERVICES REST API Description", "1.0", "Terms of Service",
				"pgoyal5@sapient.com", "license of API", "License of Url");
		// return new ApiInfo(title, description, version, termsOfServiceUrl,
		// contact, license, licenseUrl)
	}
}

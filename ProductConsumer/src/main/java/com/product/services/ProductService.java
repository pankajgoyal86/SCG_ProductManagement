/**
 * 
 */
package com.product.services;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author pgoya6
 *
 */
@Service
public class ProductService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@Lazy
	@Autowired
	private EurekaClient eurekaClient;

	
	public String serviceUrl(){
		InstanceInfo instance = eurekaClient.getNextServerFromEureka("Product-Services", false);
		return instance.getHomePageUrl();
	}
	
	@HystrixCommand(fallbackMethod="defaultProducts")
	public String getProducts() {
		// TODO Auto-generated method stub
		//return new RestTemplate().getForObject("http://localhost:8050/getAllProducts",String.class);
		return this.restTemplate.getForObject(URI.create(serviceUrl()+"getAllProducts"), String.class);
	}
	
	private String defaultProducts(){
		return "default produtcs Circuit Breaker Hystrix";
	}
	
}

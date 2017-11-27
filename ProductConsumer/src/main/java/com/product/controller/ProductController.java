/**
 * 
 */
package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.product.services.ProductService;

/**
 * @author pgoya6
 *
 */
@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	
	@GetMapping("/get")
	public String getProducts(){
		return productService.getProducts();
	}


}

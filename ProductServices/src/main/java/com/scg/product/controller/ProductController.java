/**
 * 
 */
package com.scg.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.scg.product.ProductServicesApplication;
import com.scg.product.domain.Product;
import com.scg.product.services.ProductServices;

/**
 * @author pgoya6
 *
 */
@RestController
//@Api(value = "Product Services", produces = "application/json")
public class ProductController {
	
	private static Logger log = LoggerFactory.getLogger(ProductServicesApplication.class);
	
	@Autowired
	private ProductServices ProductServices;

	
	@PostMapping("/createProduct")
	public void createProduct(@RequestBody Product product){
		log.info("create product request received");
		ProductServices.saveProduct(product);
		log.info("create product response completed");
	}
	
	@PutMapping("/updateProduct/{productId}")
	public void updateProduct(@RequestBody Product product, @PathVariable(value = "productId") String productId){
		log.info("update product request received");
		ProductServices.updateProduct(product,productId);
		log.info("update product response completed");
		
	}
	
	@DeleteMapping("/deleteProduct/{productId}")
	public void deleteProduct(@PathVariable(value = "productId") String productId){
		log.info("delete product request received");
		ProductServices.deleteProduct(productId);
		log.info("delete product response completed");
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		log.info("delete product request received");
		return ProductServices.getAllProducts();
	}
	
	@GetMapping("/getProduct/{productId}")
	public Product getProductByID(@PathVariable(value = "productId") String productId ){
		log.info("getProductByID request received");
		return ProductServices.getProductByID(productId);
	}
	
	@GetMapping("/getProductsByType/{type}")
	public List<Product> getProductByType(@PathVariable(value = "type") String type ){
		log.info("getProductByType request received");
		return ProductServices.getProductByType(type);
	}
	
	@GetMapping("/getProductBySKU/{sku}")
	public Product getProductBySKU(@PathVariable(value = "sku") String sku ){
		log.info("getProductBySKU request received");
		return ProductServices.getProductBySKU(sku);
	}
}

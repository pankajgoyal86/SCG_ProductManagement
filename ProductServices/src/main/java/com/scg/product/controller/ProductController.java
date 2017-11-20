/**
 * 
 */
package com.scg.product.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.product.domain.Product;
import com.scg.product.services.ProductServices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author pgoya6
 *
 */
@RestController
//@Api(value = "Product Services", produces = "application/json")
public class ProductController {
	
	@Autowired
	private ProductServices ProductServices;

	/*@GetMapping("/hello")
	public String getHello(){
		return "hello";
	}*/
	
	//@ApiOperation(value = "createProduct", nickname = "Create Product", notes="Create a Product")
	@PostMapping("/createProduct")
	public void createProduct(@RequestBody Product product){
		ProductServices.saveProduct(product);;
	}
	
	//@ApiOperation(value = "updateProduct/{productId}", nickname = "update Product", notes="Update a Product")
	@PutMapping("/updateProduct/{productId}")
	public void updateProduct(@RequestBody Product product, @PathVariable(value = "productId") String productId){
		ProductServices.updateProduct(product,productId);;
	}
	
	//@ApiOperation(value = "deleteProduct", nickname = "delete Product", notes="delete a Product")
	@DeleteMapping("/deleteProduct/{productId}")
	public void deleteProduct(@PathVariable(value = "productId") String productId){
		ProductServices.deleteProduct(productId);;
	}
	
	//@ApiOperation(value = "getAllProducts", nickname = "Get All Products", notes="Get All Products")
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return ProductServices.getAllProducts();
	}
	
	//@ApiOperation(value = "getProduct", nickname = "getProduct by id", notes="getProduct by product id")
	@GetMapping("/getProduct/{productId}")
	public Product getProductByID(@PathVariable(value = "productId") String productId ){
		return ProductServices.getProductByID(productId);
	}
	
	//@ApiOperation(value = "geProductsByType", nickname = "Get Products By Type", notes="getProductsByType")
	@GetMapping("/getProductsByType/{type}")
	public List<Product> getProductByType(@PathVariable(value = "type") String type ){
		return ProductServices.getProductByType(type);
	}
	
	//@ApiOperation(value = "getProductBySKU", nickname = "Get Product By SKU", notes="get Product By SKU")
	@GetMapping("/getProductBySKU/{sku}")
	public Product getProductBySKU(@PathVariable(value = "sku") String sku ){
		return ProductServices.getProductBySKU(sku);
	}
}

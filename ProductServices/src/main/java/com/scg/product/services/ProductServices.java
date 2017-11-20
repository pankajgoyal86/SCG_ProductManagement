/**
 * 
 */
package com.scg.product.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.scg.product.domain.Product;

/**
 * @author pgoya6
 *
 */
@Service
public interface ProductServices{
	public void saveProduct(Product object);
	public List<Product> getAllProducts();
	public void updateProduct(Product product, String productId);
	public void deleteProduct(String productId);
	public Product getProductByID(String productId);
	public List<Product> getProductByType(String type);
	public Product getProductBySKU(String skuId);
}

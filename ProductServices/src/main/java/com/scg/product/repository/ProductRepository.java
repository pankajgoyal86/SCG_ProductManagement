/**
 * 
 */
package com.scg.product.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.scg.product.domain.Product;


/**
 * @author pgoya6
 *
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String>  {
	public Product findByVariantSku(String sku);
	public Product findByProductId(String productId);
	public List<Product> findByType(String type);
	
	
}

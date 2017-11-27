/**
 * 
 */
package com.scg.product.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.product.domain.Product;
import com.scg.product.domain.Variant;
import com.scg.product.repository.ProductRepository;
import com.scg.product.utils.ProductUtility;

/**
 * @author pgoya6
 *
 */
@Service
public class ProductServicesImpl implements ProductServices {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void saveProduct(Product object) {
		productRepository.save(object);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public void updateProduct(Product product, String productId) {
		product.setProductId(productId);
		Product entityProduct=productRepository.findByProductId(productId);
		Product updateProd=ProductUtility.updateDomain(product, entityProduct);
		productRepository.save(updateProd);
	}

	@Override
	public void deleteProduct(String productId) {
		//productRepository.deleteById(productId);
		productRepository.delete(productId);
	}

	@Override
	public Product getProductByID(String productId) {
	return productRepository.findByProductId(productId);
		
	}

	@Override
	public List<Product> getProductByType(String type) {
		return productRepository.findByType(type);
	}

	@Override
	public Product getProductBySKU(String sku) {
		Product skuProduct= productRepository.findByVariantSku(sku);
		List<Variant> vlist= new ArrayList<Variant>();
		
		Product product = skuProduct;
		vlist=skuProduct.getVariant().stream().filter(s->s.getSku().equals(sku)).collect(Collectors.toList());
		product.setVariant(null);
		product.setVariant(vlist);
		return product;
	}

	


}

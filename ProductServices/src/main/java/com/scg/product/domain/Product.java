/**
 * 
 */
package com.scg.product.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author pgoya6
 *
 */
@Document(collection = "product")
public class Product implements Serializable, Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4045193707623855172L;

	@Id
	private String productId;
	
	private  String name;
	
	private String type;
	
	private String description;
	
	private Double price;
	
	private String weight;
	
	private List<Variant> variant;
	
	
	
	/**
	 * @param productId
	 * @param name
	 * @param type
	 * @param description
	 * @param price
	 * @param weight
	 * @param variant
	 */
	public Product(String productId, String name, String type, String description, Double price, String weight,
			List<Variant> variant) {
		super();
		this.productId = productId;
		this.name = name;
		this.type = type;
		this.description = description;
		this.price = price;
		this.weight = weight;
		this.variant = variant;
	}



	/**
	 * 
	 */
	public Product() {
		super();
	}



	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	public List<Variant> getVariant() {
		return variant;
	}

	public void setVariant(List<Variant> variant) {
		this.variant = variant;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + "]";
	}
	

}

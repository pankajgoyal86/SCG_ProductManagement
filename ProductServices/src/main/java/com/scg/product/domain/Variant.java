/**
 * 
 */
package com.scg.product.domain;

import java.io.Serializable;

/**
 * @author pgoya6
 *
 */

public class Variant implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7170919884360041795L;

	private String sku;
	
	private String displayName;
	
	private String size;
	
	private String material;
	
	private String color;
	

	@Override
	public String toString() {
		return "Variant [sku=" + sku + ", displayName=" + displayName + ", size=" + size + ", material=" + material
				+ ", color=" + color + "]";
	}

	/**
	 * 
	 */
	public Variant() {
		super();
	}

	/**
	 * @param sku
	 * @param displayName
	 * @param size
	 * @param material
	 * @param color
	 */
	public Variant(String sku, String displayName, String size, String material, String color) {
		super();
		this.sku = sku;
		this.displayName = displayName;
		this.size = size;
		this.material = material;
		this.color = color;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}

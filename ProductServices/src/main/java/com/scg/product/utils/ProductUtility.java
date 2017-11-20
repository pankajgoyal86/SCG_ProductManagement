/**
 * 
 */
package com.scg.product.utils;

import com.scg.product.domain.Product;

/**
 * @author pgoya6
 *
 */
public class ProductUtility {
	
	/*public static Update updateDomain(Product object){
		//Product p = new Product();
		Update p = new Update();
		
		if(null!=object.getDescription() ){
			p.set("description",object.getDescription());
		}
		if(null!=object.getPrice()){
			p.set("price",(Double)object.getPrice());
		}
		if(null!=object.getName()){
			p.set("name",object.getName());
		}
		if(null!=object.getType()){
			p.set("type",object.getType());
		}
		if(null!=object.getWeight()){
			p.set("weight",object.getWeight());
		}
		
		return p;
	}*/
	public static Product updateDomain(Product object1, Product object2){
		if(null!=object1.getDescription() && object1.getDescription()!="" ){
			object2.setDescription(object1.getDescription());
		}
		if(null!=object1.getPrice() && object1.getPrice()!=00.00){
			object2.setPrice(object1.getPrice());
		}
		if(null!=object1.getName()&& object1.getName()!="" ){
			object2.setName(object1.getName());
		}
		if(null!=object1.getType() && object1.getType()!=""){
			object2.setType(object1.getType());
		}
		if(null!=object1.getWeight() && object1.getWeight()!=""){
			object2.setWeight(object1.getWeight());
		}
		
		return object2;
	}

	
}

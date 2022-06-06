/**
 * 
 */
package com.mrproduct.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author SDONTUL
 *
 */
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
@Component
public class Product {
	
	@Id
	@GeneratedValue
	int productId;
	String content;
	String experianceDetails;
	Inventory inventory;
	

	public Product() {
	}
	
	public Product(int productId, String content, String experianceDetails, Inventory inventory) {
		this.productId = productId;
		this.content = content;
		this.experianceDetails = experianceDetails;
		this.inventory = inventory;
	}

	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getExperianceDetails() {
		return experianceDetails;
	}


	public void setExperianceDetails(String experianceDetails) {
		this.experianceDetails = experianceDetails;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public String toString() {
		return "productId : "+ this.getProductId() +
				"content : " + this.getContent() +
				"experianceDetails : " + this.getExperianceDetails() +
				inventory.toString();
	}
	
}

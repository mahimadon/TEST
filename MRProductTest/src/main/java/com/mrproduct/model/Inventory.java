package com.mrproduct.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
@Component
public class Inventory {
	
	@Id
	@GeneratedValue
	int inventoryId;
	int numberofItems;
	int productId;

	public Inventory() {
	}
	
	public Inventory(int inventoryId, int numberofItems, int productId) {
		super();
		this.inventoryId = inventoryId;
		this.numberofItems = numberofItems;
		this.productId = productId;
	}
	
	public int getInventoryId() {
		return inventoryId;
	}
	
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	
	public int getNumberofItems() {
		return numberofItems;
	}
	
	public void setNumberofItems(int numberofItems) {
		this.numberofItems = numberofItems;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String toString() {
		return "inventoryId : "+ this.getInventoryId() +
				"numberofItems : " + this.getNumberofItems();
	}	
}

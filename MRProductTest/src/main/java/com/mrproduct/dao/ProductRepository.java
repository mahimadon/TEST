/**
 * 
 */
package com.mrproduct.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mrproduct.model.Product;

/**
 * @author SDONTUL
 *
 */
@Repository
public interface ProductRepository {//extends JpaRepository<Product, Integer> {
	
//	public Product findByInventoryId(int inventoryId);

}

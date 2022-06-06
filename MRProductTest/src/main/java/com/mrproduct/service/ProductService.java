/**
 * 
 */
package com.mrproduct.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mrproduct.model.Product;

import com.mrproduct.dao.ProductRepository;

/**
 * @author SDONTUL
 *
 */
@Service
public interface ProductService {
	public List<Product> getAllProducts();
	public Product getProductById(int productId);
	public String bookProductByInventoryId(int inventoryId); 

}

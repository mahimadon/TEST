/**
 * 
 */
package com.mrproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrproduct.model.Product;
import com.mrproduct.service.ProductService;

/**
 * @author SDONTUL
 *
 */
@RestController()
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/getAllProducts")
	public ResponseEntity<List<Product>> getAllProducts() {
		return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getProductById/{productId}")
	public ResponseEntity<Product> getProductById(@PathVariable int productId) {
		return new ResponseEntity<Product>(productService.getProductById(productId), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/bookProductById/{inventoryId}")
	public ResponseEntity<String> bookProductById(@PathVariable int inventoryId) {
		return new ResponseEntity<String>(productService.bookProductByInventoryId(inventoryId), HttpStatus.OK);
	}
}

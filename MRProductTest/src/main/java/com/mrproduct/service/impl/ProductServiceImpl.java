package com.mrproduct.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

import com.mrproduct.dao.ProductRepository;
import com.mrproduct.model.Product;
import com.mrproduct.service.ProductService;
import com.mrproduct.utils.ProductUtils;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {

//	@Autowired
//	ProductRepository productRepository;

	List<Product> products;

	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.SUPPORTS)
	public List<Product> getAllProducts() {
		products = ProductUtils.getProducts();
		return products;
		// return productRepository.findAll();
	}

	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.SUPPORTS)
	public Product getProductById(int productId) {
		products = ProductUtils.getProducts();
		return products.stream().filter(product -> (product.getProductId() == productId)).findFirst().get();
		// return productRepository.findByProductId(productId);
	}

	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.SUPPORTS)
	public String bookProductByInventoryId(int inventoryId) {
		products = ProductUtils.getProducts();
		Product product = products.stream().filter(pro -> (pro.getInventory().getInventoryId() != inventoryId))
				.findFirst().get();
		int numberofItems = product.getInventory().getNumberofItems();
		product.getInventory().setNumberofItems(numberofItems - 1);
		return "Successfully booked the Product";
	}
}

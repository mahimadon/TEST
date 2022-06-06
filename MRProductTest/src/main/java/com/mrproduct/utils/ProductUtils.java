/**
 * 
 */
package com.mrproduct.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;
import com.mrproduct.model.Inventory;
import com.mrproduct.model.Product;

/**
 * @author SDONTUL
 *
 */
@Component
public class ProductUtils {

	public static List<Inventory> getInventory() {
			return Stream.of(new Inventory(201, 10, 101),
			new Inventory(202, 10, 102), 
			new Inventory(203, 10, 103)).collect(Collectors.toList());
	}	
	public static List<Product> getProducts () {
			return Stream.of(new Product(101, "Content One", "Experiance Details One",getInventory().get(0)),
			new Product(102, "Content Two", "Experiance Details Two",getInventory().get(1)),
			new Product(103, "Content Three", "Experiance Details Three",getInventory().get(2))).collect(Collectors.toList());

	}
}

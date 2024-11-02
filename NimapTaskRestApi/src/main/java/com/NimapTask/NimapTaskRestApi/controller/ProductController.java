package com.NimapTask.NimapTaskRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.NimapTask.NimapTaskRestApi.entity.Category;
import com.NimapTask.NimapTaskRestApi.entity.Product;
import com.NimapTask.NimapTaskRestApi.repository.ProductRepository;

@RestController
public class ProductController {
	@Autowired
   ProductRepository pr;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		List<Product> product=pr.findAll();
		return product;
		
	}
	
	@PostMapping("/api/products")
	public void createProduct(@RequestBody Product product) {
		pr.save(product);
	}
	
	
	
	
	
	@GetMapping("/api/products/{id}")
	public Product getProduct (@PathVariable int id) {
		Product product=pr.findById(id).get();
		return product;
	}
	
	@PutMapping("/api/products/{id}")
	public Product updateProduct(@PathVariable int id) {
		Product product=pr.findById(id).get();
		product.setProdName("Soap");
	   pr.save(product);
		return product;
		
	}
	
	@DeleteMapping("/api/products/{id}")
	public void removeProduct(@PathVariable int id) {
		Product  product=pr.findById(id).get();
		pr.delete(product);
	}
}

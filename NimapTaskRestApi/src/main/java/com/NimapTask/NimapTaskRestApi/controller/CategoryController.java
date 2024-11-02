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
import com.NimapTask.NimapTaskRestApi.repository.CategoryRepository;

@RestController
public class CategoryController {
	@Autowired
	CategoryRepository repo;
	
	@GetMapping("/categories")
	public List<Category> getAllCategories(){
		List<Category> cat=repo.findAll();
		return cat;
		
	}
	
	@PostMapping("/api/categories")
	public void createCategory(@RequestBody Category category) {
		repo.save(category);
	}
	
	
	
	
	
	@GetMapping("/api/categories/{id}")
	public Category getCategory (@PathVariable int id) {
		Category category=repo.findById(id).get();
		return category;
	}
	
	@PutMapping("/api/categories/{id}")
	public Category updateCategory(@PathVariable int id) {
		Category category=repo.findById(id).get();
		category.setCatName("Music");
		repo.save(category);
		return category;
		
	}
	
	@DeleteMapping("/api/categories/{id}")
	public void removeCategory(@PathVariable int id) {
		Category category=repo.findById(id).get();
		repo.delete(category);
	}
}

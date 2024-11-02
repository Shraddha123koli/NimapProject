package com.NimapTask.NimapTaskRestApi.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String catName;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="catProd",referencedColumnName = "id")
	private List<Product> product;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", catName=" + catName + ", product=" + product + "]";
	}

	public Category(int id, String catName) {
		super();
		this.id = id;
		this.catName = catName;
	}

	public Category(int id, String catName, List<Product> product) {
		super();
		this.id = id;
		this.catName = catName;
		this.product = product;
	}

	public Category() {
		super();
	}
	
	
	

}

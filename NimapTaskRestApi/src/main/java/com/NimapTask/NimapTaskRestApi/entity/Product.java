package com.NimapTask.NimapTaskRestApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String prodName;
	
	private String prodCost;
	
     @ManyToOne
     private Category category;
	
	public Product(int id, String prodName, String prodCost, Category category) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCost() {
		return prodCost;
	}

	public void setProdCost(String prodCost) {
		this.prodCost = prodCost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", prodCost=" + prodCost + ", category=" + category
				+ "]";
	}

	public Product(int id, String prodName, String prodCost) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodCost = prodCost;
	}

	public Product() {
		super();
	}
	
	

}

package com.NimapTask.NimapTaskRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NimapTask.NimapTaskRestApi.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}

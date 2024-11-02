package com.NimapTask.NimapTaskRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NimapTask.NimapTaskRestApi.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	

}

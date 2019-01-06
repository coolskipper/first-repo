package com.demo.h2.app.h2app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.h2.app.h2app.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}

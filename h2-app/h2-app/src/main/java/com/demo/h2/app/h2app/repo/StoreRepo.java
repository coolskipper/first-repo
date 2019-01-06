package com.demo.h2.app.h2app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.h2.app.h2app.entity.Store;

public interface StoreRepo extends JpaRepository<Store, Integer>{

}

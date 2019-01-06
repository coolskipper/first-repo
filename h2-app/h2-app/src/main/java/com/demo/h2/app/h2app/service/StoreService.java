package com.demo.h2.app.h2app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.h2.app.h2app.dto.StoreDTO;
import com.demo.h2.app.h2app.entity.Store;
import com.demo.h2.app.h2app.repo.StoreRepo;

@Service
public class StoreService {

  private StoreRepo storeRepo;

  @Autowired
  public StoreService(StoreRepo storeRepo) {
    this.storeRepo = storeRepo;
  }

  public StoreDTO getStoreDetailById(int storeId) {

    StoreDTO store = null;
    Optional<Store> stOptional = storeRepo.findById(storeId);
    if (stOptional.isPresent()) {

      Store storeEntity = stOptional.get();
      store = this.valueOf(storeEntity);
    }
    return store;
  }

  public List<StoreDTO> getAllStoreDetails() {
    List<StoreDTO> storeModels = new ArrayList<>();
    List<Store> storesEntities = storeRepo.findAll();

    for (Store storesEntity : storesEntities) {
      StoreDTO storeModel = this.valueOf(storesEntity);
      storeModels.add(storeModel);
    }
    return storeModels;

  }

  public Store updateStoreData(int storeId, StoreDTO storeModel) {

    Store storesUpdatedEntity = null;
    Optional<Store> stOptional = storeRepo.findById(storeId);
    if (stOptional.isPresent()) {
      Store storesEntity = this.valuef(storeModel);
      storesUpdatedEntity = storeRepo.save(storesEntity);
    }

    return storesUpdatedEntity;
  }

  public Store addStore(StoreDTO store) {

    Store storeEntity = this.valuef(store);
    Store storeEntityop = storeRepo.saveAndFlush(storeEntity);
    return storeEntityop;
  }

  private StoreDTO valueOf(Store storeEntity) {

    StoreDTO store = new StoreDTO();
    store.setStoreId(storeEntity.getStoreId());
    store.setStoreName(storeEntity.getStoreName());
    store.setStoreCity(storeEntity.getStoreCity());

    return store;

  }

  private Store valuef(StoreDTO store) {

    Store storeEntity = new Store();

    storeEntity.setStoreName(store.getStoreName());
    storeEntity.setStoreCity(store.getStoreCity());
    storeEntity.setStoreId(store.getStoreId());
    return storeEntity;
  }
}

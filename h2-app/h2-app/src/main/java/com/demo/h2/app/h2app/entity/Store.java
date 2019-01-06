package com.demo.h2.app.h2app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DECATH_STORE")
public class Store {

  @Id
  @Column(columnDefinition = "Number(38,0)", name = "STORE_ID", nullable = false)
  private int storeId;
  @Column(columnDefinition = "VARCHAR2(100)", name = "STORE_NAME", nullable = true)
  private String storeName;
  @Column(columnDefinition = "VARCHAR2(100)", name = "STORE_CITY", nullable = true)
  private String storeCity;

  public int getStoreId() {
    return storeId;
  }

  public void setStoreId(int storeId) {
    this.storeId = storeId;
  }

  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public String getStoreCity() {
    return storeCity;
  }

  public void setStoreCity(String storeCity) {
    this.storeCity = storeCity;
  }

}

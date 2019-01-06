package com.demo.h2.app.h2app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DECATH_PRODUCT")
public class Product {

  @Id
  @Column(columnDefinition = "Number(38,0)", name = "PRODUCT_ID", nullable = false)
  private int productId;
  @Column(columnDefinition = "VARCHAR2(100)", name = "PRODUCT_NAME", nullable = true)
  private String productName;
  @Column(columnDefinition = "VARCHAR2(100)", name = "PRODUCT_SPORT", nullable = true)
  private String productSport;
  @Column(columnDefinition = "VARCHAR2(100)", name = "PRODUCT_LEVEL", nullable = true)
  private String productLevel;
  @Column(columnDefinition = "VARCHAR2(100)", name = "PRODUCT_DESC", nullable = true)
  private String productDesc;
  @Column(columnDefinition = "Number(38,0)", name = "ASSOCIATED_STORES", nullable = true)
  private int associatedStore;

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductSport() {
    return productSport;
  }

  public void setProductSport(String productSport) {
    this.productSport = productSport;
  }

  public String getProductLevel() {
    return productLevel;
  }

  public void setProductLevel(String productLevel) {
    this.productLevel = productLevel;
  }

  public String getProductDesc() {
    return productDesc;
  }

  public void setProductDesc(String productDesc) {
    this.productDesc = productDesc;
  }

  public int getAssociatedStore() {
    return associatedStore;
  }

  public void setAssociatedStore(int associatedStore) {
    this.associatedStore = associatedStore;
  }

}

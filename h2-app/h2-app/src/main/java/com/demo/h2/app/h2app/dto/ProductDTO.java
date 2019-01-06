package com.demo.h2.app.h2app.dto;

public class ProductDTO {

  private int productId;
  private String productName;
  private String productSport;
  private String productLevel;
  private String productDesc;
  private int associatedStores;

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

  public int getAssociatedStores() {
    return associatedStores;
  }

  public void setAssociatedStores(int associatedStores) {
    this.associatedStores = associatedStores;
  }

}

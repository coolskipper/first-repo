package com.demo.h2.app.h2app.exception;

public class ProductException extends RuntimeException {

  private String productId;

  public ProductException(String productId) {
    super(productId);
  }

  public String getProductId() {
    return productId;
  }

}

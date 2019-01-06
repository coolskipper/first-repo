package com.demo.h2.app.h2app.exception;

public class StoreException extends RuntimeException {

  private String storeId;

  public StoreException(String storeId) {

    super(storeId);
  }

  public String getStoreId() {
    return storeId;
  }

}

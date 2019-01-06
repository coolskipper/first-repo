package com.demo.h2.app.h2app.exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessagesGenerator {
  private String errorMessageValue;
  private String errorMessageKey;

  public ErrorMessagesGenerator() {
  }

  public ErrorMessagesGenerator(String errorMessageValue, String errorMessageKey) {
    this.errorMessageValue = errorMessageValue;
    this.errorMessageKey = errorMessageKey;
  }

  public String getErrorMessageValue() {
    return errorMessageValue;
  }

  public void setErrorMessageValue(String errorMessageValue) {
    this.errorMessageValue = errorMessageValue;
  }

  public String getErrorMessageKey() {
    return errorMessageKey;
  }

  public void setErrorMessageKey(String errorMessageKey) {
    this.errorMessageKey = errorMessageKey;
  }

}

package com.demo.h2.app.h2app.exception;

public enum ErrorMessages {
  
  NO_RECORD_FOUND("No record found for provided id"),
  RECORD_ALREADY_EXISTS("Record already exists");
  
  private String errorMessage; 
  
  ErrorMessages(String errorMessage)
  {
     this.errorMessage = errorMessage;    
  }
   /**
    * @return the errorMessage
    */
   public String getErrorMessage() {
       return errorMessage;
   }
   /**
    * @param errorMessage the errorMessage to set
    */
   public void setErrorMessage(String errorMessage) {
       this.errorMessage = errorMessage;
   }

}

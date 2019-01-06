package com.demo.h2.app.h2app.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ProductExceptionMapper implements ExceptionMapper<ProductException> {

  @Override
  public Response toResponse(ProductException exception) {
    ErrorMessagesGenerator errorMessage = new ErrorMessagesGenerator(exception.getMessage(),
        ErrorMessages.NO_RECORD_FOUND.name());

    return Response.status(Response.Status.BAD_REQUEST).entity(errorMessage).build();
  }

}

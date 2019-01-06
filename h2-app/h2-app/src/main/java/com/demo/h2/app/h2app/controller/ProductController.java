package com.demo.h2.app.h2app.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.h2.app.h2app.dto.ProductDTO;
import com.demo.h2.app.h2app.entity.Product;
import com.demo.h2.app.h2app.service.ProductService;

@Path("/product")
public class ProductController {

  private ProductService productService;

  @Autowired
  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/{productId}")
  public Response getProductDetailsById(@PathParam("productId") int productId) {
    ProductDTO productModel = productService.findByProductId(productId);
    return Response.ok(productModel).build();

  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response addProduct(ProductDTO productModel) {

    Product productsEntity = productService.addProduct(productModel);
    return Response.ok(productsEntity).build();

  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response getllProductDetails() {
    List<Product> productsEntities = productService.findAllproducts();
    return Response.ok(productsEntities).build();

  }

  @PUT
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/{productId}")
  public Response getUpdateStoeDetails(@PathParam("productId") int productId, ProductDTO productModel) {
    Product productsEntity = productService.upadteProduct(productId, productModel);
    return Response.ok(productsEntity).build();

  }
}

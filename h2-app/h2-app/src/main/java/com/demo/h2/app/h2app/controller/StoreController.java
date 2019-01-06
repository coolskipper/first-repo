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

import com.demo.h2.app.h2app.dto.StoreDTO;
import com.demo.h2.app.h2app.entity.Store;
import com.demo.h2.app.h2app.service.StoreService;

@Path("/store")
public class StoreController {

  StoreService storeService;

  @Autowired
  public StoreController(StoreService storeService) {
    this.storeService = storeService;

  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/{storeId}")
  public Response getStoreDetailsById(@PathParam("storeId") int storeId) {
    StoreDTO store = storeService.getStoreDetailById(storeId);
    return Response.ok(store).build();

  }

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response addStore(StoreDTO store) {

    Store savedData = storeService.addStore(store);
    return Response.ok(savedData).build();

  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Response getStoreAllDetails() {
    List<StoreDTO> storeModels = storeService.getAllStoreDetails();
    return Response.ok(storeModels).build();

  }

  @PUT
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @Path("/{storeID}")
  public Response getUpdateStoeDetails(@PathParam("storeID") int storeId, StoreDTO storeModel) {
    Store storeEntity = storeService.updateStoreData(storeId, storeModel);
    return Response.ok(storeEntity).build();

  }

}

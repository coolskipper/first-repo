package com.demo.h2.app.h2app.service;

import java.util.List;
import java.util.Optional;

import javax.security.auth.login.CredentialException;

import org.springframework.stereotype.Service;

import com.demo.h2.app.h2app.dto.ProductDTO;
import com.demo.h2.app.h2app.entity.Product;
import com.demo.h2.app.h2app.exception.ErrorMessages;
import com.demo.h2.app.h2app.exception.ProductException;
import com.demo.h2.app.h2app.repo.ProductRepo;
import com.sun.jersey.spi.inject.Errors.ErrorMessage;

@Service
public class ProductService {

  private ProductRepo productRepo;

  public ProductService(ProductRepo productRepo) {
    this.productRepo = productRepo;

  }

  public ProductDTO findByProductId(int productId) {

    ProductDTO productModel = null;
    Optional<Product> productOptional = productRepo.findById(productId);

    if (productOptional.isPresent()) {
      productModel = this.valueOf(productOptional.get());
    } else {
      throw new ProductException(ErrorMessages.NO_RECORD_FOUND.getErrorMessage());
    }
    return productModel;
  }

  public Product addProduct(ProductDTO productModel) {
    Product productsEntity = this.valuef(productModel);

    Product savedProduct = productRepo.saveAndFlush(productsEntity);

    return savedProduct;

  }

  public List<Product> findAllproducts() {

    List<Product> productsEntities = productRepo.findAll();
    return productsEntities;
  }

  public Product upadteProduct(int productId, ProductDTO productModel) {

    Optional<Product> productOptional = productRepo.findById(productId);
    Product updatedProductsEntity = null;
    if (productOptional.isPresent()) {
      Product productsEntity = this.valuef(productModel);
      updatedProductsEntity = productRepo.save(productsEntity);
    }
    return updatedProductsEntity;

  }

  private Product valuef(ProductDTO productModel) {

    Product productsEntity = new Product();
    productsEntity.setProductId(productModel.getProductId());
    productsEntity.setProductDesc(productModel.getProductDesc());
    productsEntity.setProductLevel(productModel.getProductLevel());
    productsEntity.setProductName(productModel.getProductName());
    productsEntity.setProductSport(productModel.getProductSport());
    productsEntity.setAssociatedStore(productModel.getAssociatedStores());
    return productsEntity;
  }

  private ProductDTO valueOf(Product productsEntity) {

    ProductDTO productModel = new ProductDTO();
    productModel.setProductId(productsEntity.getProductId());
    productModel.setAssociatedStores(productsEntity.getAssociatedStore());
    productModel.setProductDesc(productsEntity.getProductDesc());
    productModel.setProductLevel(productsEntity.getProductLevel());
    productModel.setProductSport(productsEntity.getProductSport());
    productModel.setProductName(productsEntity.getProductName());

    return productModel;

  }

}

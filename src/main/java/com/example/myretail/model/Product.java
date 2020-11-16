package com.example.myretail.model;

import org.springframework.data.annotation.Id;

public class Product {

  @Id private String id;
  private String productId;
  private String price;

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductID(String productId) {
    this.productId = productId;
  }
}

package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class TestDeleteProduct {
public static void main(String[] args) {
	ProductService productService= new ProductService();
	Product product =new Product();
	product.setId(3);
	productService.deleteProduct(product);
	
	System.out.println("deleted");
}
  
}

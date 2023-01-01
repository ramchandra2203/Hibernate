package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class TestUpdate {
public static void main(String[] args) {
	ProductService productService= new ProductService();
	Product product = new Product();
	

	product.setId(3);
	product.setName("ankit");
	
	Product product2 = productService.updateProduct(product);
	  if(product2!=null) {
		  System.out.println("Product Updated");
	  }else {
		  System.out.println("Product not Updated");
	  }
}
}

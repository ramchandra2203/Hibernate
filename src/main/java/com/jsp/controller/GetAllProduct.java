package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetAllProduct {
public static void main(String[] args) {
	ProductService productService= new ProductService();
	Product product = new Product();
	product.setId(1);
	
	Product product2 = productService.getAllProduct(product);
	
}
}


package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetProductById {

	public static void main(String[] args) {
		ProductService productService=new ProductService();    
	    Product product=new Product();
	   if(product !=null) {
	    	product.setId(2);
	    	productService.getProductById(product);
	    	Product product3= productService.getProductById(product);
	    	 }else {
	    	System.out.println("product not found");
	    }
	}

}

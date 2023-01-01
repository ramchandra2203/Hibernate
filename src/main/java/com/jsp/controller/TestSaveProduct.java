package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class TestSaveProduct {

	public static void main(String[] args) {
		
    ProductService productService=new ProductService();
    
    
    Product product=new Product();
    
    product.setName("Tshirt");
    product.setBrand("ZARA");
    product.setType("clothing");
    product.setPrice(4500);
    
    Product product4= productService.saveProduct(product);
    if(product4 !=null) {
    	System.out.println("prduct inserted ");
    }else {
    	System.out.println("not inserted ");
    }
	}

}

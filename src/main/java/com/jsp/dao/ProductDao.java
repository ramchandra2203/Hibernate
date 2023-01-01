package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Product;


public class ProductDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	
	public Product saveProduct(Product product) {
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		
		return product;
	}
	
	public 	Product updateProduct(Product Product) {
		
		Product product = entityManager.find(Product.class, Product.getId());
	    product.setName(Product.getName());
	
		
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
		
		return product;
	}
	
	public 	Product deleteProduct(Product Product) {
		
		Product product = entityManager.find(Product.class, Product.getId());
		
		
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
		
		return product;
	}
	
    public 	Product getProduct(Product Product) {
		
		Product product = entityManager.find(Product.class, Product.getId());
		
		if(product != null) {
			System.out.println(product.getId());
			System.out.println(product.getBrand());
			System.out.println(product.getName());
			System.out.println(product.getType());
			System.out.println(product.getPrice());
		}
		else {
			System.out.println("No Object Product Found");
		}
		return product;
	}
    public 	Product getAllProduct(Product Product) {
		
		
		String sql = "Select p FROM Product p";
		Query query = entityManager.createQuery(sql);
		List<Product> products = query.getResultList();
		
	    for (Product p : products) {
			System.out.println("==============");
			System.out.println(p.getId());
			System.out.println(p.getBrand());
			System.out.println(p.getName());
			System.out.println(p.getType());
			System.out.println(p.getPrice());
		}
		
		return Product;
	}
    
 
}
package com.hajaeba.SportyShoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hajaeba.SportyShoes.entity.Categories;
import com.hajaeba.SportyShoes.entity.Product;
import com.hajaeba.SportyShoes.jdbc.ProductRepository;

@Service
public class ProductService {
	@Autowired
	public ProductRepository prodrepo;
	
	public List<Product> listAll()
	{
		return prodrepo.findAll();
	}
	
	public void save(Product product)
	{
		prodrepo.save(product);
	}

}

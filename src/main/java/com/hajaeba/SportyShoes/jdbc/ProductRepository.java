package com.hajaeba.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hajaeba.SportyShoes.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}

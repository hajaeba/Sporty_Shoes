package com.hajaeba.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hajaeba.SportyShoes.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}

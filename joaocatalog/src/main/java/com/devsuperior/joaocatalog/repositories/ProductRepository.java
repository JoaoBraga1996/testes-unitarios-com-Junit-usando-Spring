package com.devsuperior.joaocatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.joaocatalog.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

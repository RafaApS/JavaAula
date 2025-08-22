package com.fatec.helloo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fatec.helloo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}

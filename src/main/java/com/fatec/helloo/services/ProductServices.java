package com.fatec.helloo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.helloo.entities.Product;
import com.fatec.helloo.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductServices {
    @Autowired

    private ProductRepository repository;

    public List<Product> getAllProducts(){
        return repository.findAll();

    }

    public Product getProductById(long id){
        return repository.findById(id)
                         .orElseThrow(
                            () -> new EntityNotFoundException("Produto não cadastrado.")
                         );
    }
}

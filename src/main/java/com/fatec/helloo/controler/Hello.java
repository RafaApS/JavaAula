package com.fatec.helloo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.helloo.entities.Product;
import com.fatec.helloo.services.ProductServices;



@RestController
//O nome da pagina no google depois de localhost:8080
@RequestMapping("hello")
public class Hello {
    
    @Autowired
    private ProductServices service;

    //Anotando um método
    @GetMapping
    //Metodo:
    public List<Product> getProducts(){
        return service.getAllProducts();

    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable long id){
        return service.getProductById(id);
    }
    
}

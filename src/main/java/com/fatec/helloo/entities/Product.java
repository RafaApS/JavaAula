package com.fatec.helloo.entities;

import java.io.Serializable;

//todos tem que ser persistence 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Para classificar como entidade
@Entity

//PARA COLOCAR O NOME DO BANDO DE DADOS 
@Table(name="TBL_PRODUCT")
public class Product implements Serializable{

    //id define a chave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Qual quer coisa em java que começa com letra maiuscula é uma classe 
    private Long id;
    private Double price;
    private String name;

    //clica com o botao direito "Source Actions" e depois getters and setters e marca tudo
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //clica com o botão direito "Soucer Action" depois hashCode e marca apenas o id
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
}

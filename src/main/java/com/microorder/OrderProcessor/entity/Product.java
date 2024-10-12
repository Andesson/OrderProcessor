package com.microorder.OrderProcessor.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "t_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Adicione outros atributos necessários, por exemplo:
    private String name; // Nome do produto
    private BigDecimal price; // Preço do produto
    // Adicione outros atributos conforme necessário
}

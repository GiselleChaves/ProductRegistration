package com.example.springboot.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct; //EVITA CONFLITOS COMO ID SEQUENCIAIS, UTILIZADO EM ARQUITETURAS DISTRIBUÍDAS(MICROSSERVICES)
    private String name;
    private BigDecimal value;
}

package com.coutodev.psoto_combustivel.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tipos_De_Combustivel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class TipoDeCombustivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "preco_Por_Litro")
    private BigDecimal precoPorLitro;
}

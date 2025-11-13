package com.coutodev.psoto_combustivel.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bomba_De_Combustivel")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BombasDeCombustivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "combustivel_id")
    private TipoDeCombustivel tipoDeCombustivel;

}

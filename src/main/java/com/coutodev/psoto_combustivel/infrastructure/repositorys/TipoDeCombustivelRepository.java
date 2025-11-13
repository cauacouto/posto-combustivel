package com.coutodev.psoto_combustivel.infrastructure.repositorys;

import com.coutodev.psoto_combustivel.infrastructure.entities.TipoDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDeCombustivelRepository extends JpaRepository<TipoDeCombustivel,Integer> {
}

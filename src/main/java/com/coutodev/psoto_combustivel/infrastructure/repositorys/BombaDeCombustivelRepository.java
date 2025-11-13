package com.coutodev.psoto_combustivel.infrastructure.repositorys;

import com.coutodev.psoto_combustivel.infrastructure.entities.BombasDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BombaDeCombustivelRepository extends JpaRepository<BombasDeCombustivel,Integer> {
}

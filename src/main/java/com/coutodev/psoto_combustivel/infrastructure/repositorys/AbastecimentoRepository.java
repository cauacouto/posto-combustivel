package com.coutodev.psoto_combustivel.infrastructure.repositorys;

import com.coutodev.psoto_combustivel.infrastructure.entities.Abastecimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbastecimentoRepository extends JpaRepository<Abastecimento,Integer> {
}

package com.coutodev.psoto_combustivel.Service;

import com.coutodev.psoto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.coutodev.psoto_combustivel.infrastructure.repositorys.BombaDeCombustivelRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BombaDeCombustivelService {

    @Autowired
    BombaDeCombustivelRepository bombaDeCombustivelRepository;


    public void criar(BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelRepository.save(bombasDeCombustivel);
    }


    public BombasDeCombustivel buscarBombaCombustivelPorId(Integer id){
        return   bombaDeCombustivelRepository.findById(id).orElseThrow(()->
                new NullPointerException("bomba de combustivel não encontrada" + id));
    }


    @Transactional
    public void deletarBombaDeCombustivelPorId(Integer id){
        bombaDeCombustivelRepository.deleteById(id);
    }

    public void alterarBombaCombustivel(Integer id,BombasDeCombustivel bombasDeCombustivel){
        BombasDeCombustivel bomba = buscarBombaCombustivelPorId(id);
        bombasDeCombustivel.setId(bomba.getId());
        bombaDeCombustivelRepository.save(bombasDeCombustivel);
    }
}

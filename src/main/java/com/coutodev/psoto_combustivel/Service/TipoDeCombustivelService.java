package com.coutodev.psoto_combustivel.Service;

import com.coutodev.psoto_combustivel.infrastructure.entities.TipoDeCombustivel;
import com.coutodev.psoto_combustivel.infrastructure.repositorys.TipoDeCombustivelRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDeCombustivelService {

    @Autowired
    TipoDeCombustivelRepository tipoDeCombustivelRepository;

    public void criar(TipoDeCombustivel tipoDeCombustivel){
        tipoDeCombustivelRepository.save(tipoDeCombustivel);
    }

    public TipoDeCombustivel buscarTipoDeCombustivelPorId(Integer id){
        return tipoDeCombustivelRepository.findById(id).orElseThrow(()->
                new NullPointerException("tipo de combustivel não encontrado" + id));

    }

    public List<TipoDeCombustivel> buscarTipoDeCombustivel(){
        return tipoDeCombustivelRepository.findAll();
    }

    public void alterarTipoDeCombustivel(Integer id , TipoDeCombustivel tipoDeCombustivel){
        TipoDeCombustivel tipo = buscarTipoDeCombustivelPorId(id);
        tipoDeCombustivel.setId(tipo.getId());
        tipoDeCombustivelRepository.save(tipoDeCombustivel);
    }

    @Transactional
    public void deletarTipoDeCombustivelPorId(Integer id){
        tipoDeCombustivelRepository.deleteById(id);
    }
}

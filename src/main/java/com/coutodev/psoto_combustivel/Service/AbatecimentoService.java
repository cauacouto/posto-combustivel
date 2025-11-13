package com.coutodev.psoto_combustivel.Service;

import com.coutodev.psoto_combustivel.infrastructure.entities.Abastecimento;
import com.coutodev.psoto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.coutodev.psoto_combustivel.infrastructure.repositorys.AbastecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class AbatecimentoService {

    @Autowired
    AbastecimentoRepository abastecimentoRepository;
    @Autowired
    BombaDeCombustivelService bombaDeCombustivelService;

    public void abastecer(Integer bombaId,Long litros){
        BombasDeCombustivel bomba = bombaDeCombustivelService.buscarBombaCombustivelPorId(bombaId);
        BigDecimal valorTotal = bomba.getTipoDeCombustivel().getPrecoPorLitro().multiply(BigDecimal.valueOf(litros));

        Abastecimento abastecimento = Abastecimento.builder()
                .  dataAbastecimento(LocalDate.now())
                .valorTotal(valorTotal)
                .bombasDeCombustivel(bomba)
                .quantidadeLitros(litros)
                .  build();
        abastecimentoRepository.save(abastecimento);
    }

    public List<Abastecimento> buscarAbastecimento(){
        return abastecimentoRepository.findAll();
    }
}

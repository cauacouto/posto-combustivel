package com.coutodev.psoto_combustivel.Controller;

import com.coutodev.psoto_combustivel.Service.AbatecimentoService;
import com.coutodev.psoto_combustivel.infrastructure.entities.Abastecimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/abastecimento")
public class abastecimentoController {

    @Autowired
    AbatecimentoService abatecimentoService;

    @PostMapping
    public ResponseEntity<Void> abastecer(@RequestParam("quantidadeEmLitros") Long litros,@RequestParam("idBomba") Integer idBomba){
        abatecimentoService.abastecer(idBomba,litros);
        return ResponseEntity.accepted().build();
    }
    @GetMapping
    public ResponseEntity<Abastecimento> buscarAbastecimento(){
        abatecimentoService.buscarAbastecimento();
        return ResponseEntity.ok().build();
    }
}

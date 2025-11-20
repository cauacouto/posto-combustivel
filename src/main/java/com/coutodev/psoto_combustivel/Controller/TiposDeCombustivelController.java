package com.coutodev.psoto_combustivel.Controller;

import com.coutodev.psoto_combustivel.Service.TipoDeCombustivelService;
import com.coutodev.psoto_combustivel.infrastructure.entities.TipoDeCombustivel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TiposDeCombustivel")
public class TiposDeCombustivelController {

    @Autowired
    TipoDeCombustivelService tipoDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody TipoDeCombustivel tipoDeCombustivel){
        tipoDeCombustivelService.criar(tipoDeCombustivel);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoDeCombustivel> buscasTiposDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        tipoDeCombustivelService.buscarTipoDeCombustivelPorId(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<TipoDeCombustivel>> buscasTiposDeCombustivel() {
        tipoDeCombustivelService.buscarTipoDeCombustivel();
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTipoDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        tipoDeCombustivelService.deletarTipoDeCombustivelPorId(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping
    public ResponseEntity<Void> AlterarTipoDeCombustivel(@RequestParam(name = "id") Integer id, @RequestBody TipoDeCombustivel tipoDeCombustivel){
        tipoDeCombustivelService.alterarTipoDeCombustivel(id, tipoDeCombustivel);
        return ResponseEntity.accepted().build();
    }
}


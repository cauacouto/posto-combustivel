package com.coutodev.psoto_combustivel.Controller;

import com.coutodev.psoto_combustivel.Service.BombaDeCombustivelService;
import com.coutodev.psoto_combustivel.infrastructure.entities.BombasDeCombustivel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BombasDeCombustivel")
public class BombasDeCombustivelController {

    @Autowired
    BombaDeCombustivelService bombaDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelService.criar(bombasDeCombustivel);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BombasDeCombustivel> buscaBombaDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        bombaDeCombustivelService.buscarBombaCombustivelPorId(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<BombasDeCombustivel>> buscasBombaDeCombustivel() {
        bombaDeCombustivelService.buscarBombaDeCombustivel();
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarBombaDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        bombaDeCombustivelService.deletarBombaDeCombustivelPorId(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping
    public ResponseEntity<Void> AlterarBombaDeCombustivel(@RequestParam(name = "id") Integer id, @RequestBody BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelService.alterarBombaCombustivel(id,bombasDeCombustivel );
        return ResponseEntity.accepted().build();
    }
}


package com.example.meu_primeiro_spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.meu_primeiro_spring_boot.model.TransacaoModel;
import com.example.meu_primeiro_spring_boot.service.TransacaoService;

@RestController
public class TrasacaoController {
    
    // private TransacaoModel transacaoModel;
    @Autowired
    private TransacaoService transacaoService;

    @PostMapping("/transacao")
    public ResponseEntity<List<TransacaoModel>> transacao(@RequestBody TransacaoModel transacaoModel){
        return ResponseEntity.ok(transacaoService.recebertrasacao(transacaoModel));
    }

    @DeleteMapping("/del")
    public String deletarRegistros(){
        transacaoService.deletartransacoes();
        return "transacoes apagadas";
    }

    // @GetMapping("/lista")
    // public List<TransacaoModel> getTransacao(){
    //     return transacaoService.transacoes();
    // }




    // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 






    // vai toma no cu todo mundo // vai toma no cu todo mundo // vai toma no cu todo mundo // vai toma no cu todo mundo // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 
    // vai toma no cu todo mundo 

}

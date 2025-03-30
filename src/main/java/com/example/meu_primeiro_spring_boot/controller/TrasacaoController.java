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

    // @GetMapping("/lista")
    // public List<TransacaoModel> getTransacao(){
    //     return transacaoService.transacoes();
    // }

}

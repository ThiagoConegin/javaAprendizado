package com.example.meu_primeiro_spring_boot.service;

import java.lang.reflect.Array;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.DoubleStream;

import org.springframework.stereotype.Service;
import com.example.meu_primeiro_spring_boot.model.TransacaoModel;

@Service
public class TransacaoService {
    
    private List<TransacaoModel> list = new ArrayList<>();


    public List<TransacaoModel> recebertrasacao(TransacaoModel transacaoModel){

        if(transacaoModel.getValor() < 0){
            throw new IllegalArgumentException("Valor menos que zero nao é permitido");
        }

        if(transacaoModel.getDataHora().isAfter(OffsetDateTime.now())){
            throw new IllegalArgumentException("Data no futuro!"); 
        }

        list.add(transacaoModel);
        return list;

    }

    public void deletartransacoes(){
        list.removeAll(list);
    }

    // public List<TransacaoModel> transacoes(){


    // }

}

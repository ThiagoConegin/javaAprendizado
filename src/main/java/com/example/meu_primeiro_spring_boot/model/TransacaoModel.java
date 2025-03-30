package com.example.meu_primeiro_spring_boot.model;

import java.time.OffsetDateTime;

import org.springframework.stereotype.Component;

@Component
public class TransacaoModel {

    private Double valor;
    private OffsetDateTime dataHora;
    
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
    
}

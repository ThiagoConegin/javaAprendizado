package com.example.meu_primeiro_spring_boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.meu_primeiro_spring_boot.model.ClientModel;;

@Service
public class ClientService {

    private ClientModel clientModel;
    private List<ClientModel> lista = new ArrayList<>();

    public void registrarCliente(ClientModel clientModel){

        lista.add(clientModel);

    }

    public List<ClientModel> exibirClientes(){
        return lista;
    }
    
}

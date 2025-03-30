package com.example.meu_primeiro_spring_boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.meu_primeiro_spring_boot.model.ClientModel;
import com.example.meu_primeiro_spring_boot.service.ClientService;;



@RestController
public class ClientController {

    private ClientService clientService = new ClientService();

    @PostMapping("/register")
    public String registrarClient(@RequestBody ClientModel clientModel){
        clientService.registrarCliente(clientModel);
        return "Registrado com sucesso";
    }

    @GetMapping("/listaa")
    public List<ClientModel> listarPaciente(){
        return clientService.exibirClientes();
    }
    
}
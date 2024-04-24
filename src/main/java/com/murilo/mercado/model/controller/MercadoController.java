/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murilo.mercado.model.controller;

import com.murilo.mercado.model.AdministradorModel;
import com.murilo.mercado.model.ClienteModel;
import com.murilo.mercado.model.MercadoModel;
import com.murilo.mercado.view.MercadoView;

/**
 *
 * @author murilo
 */
public class MercadoController {
    
    
    public boolean addCliente(String name, String cpf){
        
        ClienteModel cliente = getCliente(cpf);
        
        if (cliente == null) {
            MercadoModel.getClientes().add(new ClienteModel(name, cpf));
            return true;
        }
        
        return false;
    }
    
    public ClienteModel getCliente(String cpf){
        return MercadoModel.getClientes().stream()
            .filter(c -> c.getCpf().equals(cpf))
            .findAny()
            .orElse(null);
    }
    
    public void createView(ClienteModel cliente){
        MercadoView mercado =  new MercadoView(cliente);
        mercado.setVisible(true);
    }
}

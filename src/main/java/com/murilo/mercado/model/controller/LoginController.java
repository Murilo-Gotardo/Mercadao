/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murilo.mercado.model.controller;

import com.murilo.mercado.model.AdministradorModel;
import com.murilo.mercado.model.ClienteModel;
import com.murilo.mercado.model.MercadoModel;
import javax.swing.JFrame;

/**
 *
 * @author murilo
 */
public class LoginController {
    
    MercadoController mercadoController = new MercadoController();
    
    public ClienteModel login(String name, String cpf){
        ClienteModel cliente = mercadoController.getCliente(cpf);
        
        if (mercadoController.getCliente(cpf) == null) {
            mercadoController.addCliente(name, cpf);
        } 
        
        return mercadoController.getCliente(cpf);
    }
    
    public void logout(JFrame frame){
        frame.dispose();
    }
}

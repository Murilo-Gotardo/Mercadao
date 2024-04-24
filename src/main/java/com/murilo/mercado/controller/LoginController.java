/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murilo.mercado.controller;

import com.murilo.mercado.model.AdministradorModel;
import com.murilo.mercado.model.ClienteModel;
import com.murilo.mercado.model.abstraction.Pessoa;
import com.murilo.mercado.view.LoginView;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author murilo
 */
public class LoginController {

    private final MercadoController mercadoController = new MercadoController();

    public boolean login(String name, String cpf, boolean isAdmin, JLabel textRequirements) {
        Pessoa pessoa = null;
        if (mercadoController.getAdmin(cpf) == null && mercadoController.getCliente(cpf) == null) {
            if (isAdmin) {
                mercadoController.addAdmin(name, cpf);
            } else {
                mercadoController.addCliente(name, cpf);
            }
            pessoa = isAdmin ? mercadoController.getAdmin(cpf) : mercadoController.getCliente(cpf);
            
            return true;
        } else {
            pessoa = !isAdmin ? mercadoController.getAdmin(cpf) : mercadoController.getCliente(cpf);
            if (isAdmin && pessoa instanceof ClienteModel) {
                //JOptionPane.showMessageDialog(null, "Clientes não podem acessar a área de Admins", "Cliente Negado", JOptionPane.ERROR_MESSAGE);
                textRequirements.setText("*Clientes não podem acessar a área de Admins");
                textRequirements.setVisible(true);
                return false;
            } else if (!isAdmin && pessoa instanceof AdministradorModel) {
                //JOptionPane.showMessageDialog(null, "Admins não podem fazer compras", "Admin Negado", JOptionPane.ERROR_MESSAGE);
                textRequirements.setText("*Admins não podem fazer compras");
                textRequirements.setVisible(true);
                return false;
            } else {
                return true;
            }
        }
    }

    public void logout(JFrame frame) {
        frame.dispose();
    }
    
    public void createView(){
        LoginView login = new LoginView();
        login.setVisible(true);
    }
}

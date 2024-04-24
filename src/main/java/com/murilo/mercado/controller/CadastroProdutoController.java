/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murilo.mercado.controller;

import com.murilo.mercado.model.ClienteModel;
import com.murilo.mercado.view.CadastroProdutoView;
import com.murilo.mercado.view.MercadoView;

/**
 *
 * @author murilo
 */
public class CadastroProdutoController {
    
    public void createView(){
        CadastroProdutoView cadastro =  new CadastroProdutoView();
        cadastro.setVisible(true);
    }
}

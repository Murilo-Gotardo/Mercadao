/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murilo.mercado.model;

import com.murilo.mercado.model.abstraction.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author murilo
 */
public class ClienteModel extends Pessoa{
   
    private List<ProdutoModel> produtos = new ArrayList<ProdutoModel>();

    public ClienteModel(String nome, String cpf) {
        super(nome, cpf);
    }
 
    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoModel> produtos) {
        this.produtos = produtos;
    }
}

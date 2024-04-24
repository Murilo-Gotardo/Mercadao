/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murilo.mercado.controller;

import com.murilo.mercado.model.AdministradorModel;
import com.murilo.mercado.model.ClienteModel;
import com.murilo.mercado.model.MercadoModel;
import com.murilo.mercado.model.ProdutoModel;
import com.murilo.mercado.view.MercadoView;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author murilo
 */
public class MercadoController {
    
    public boolean addCliente(String name, String cpf) {
        ClienteModel cliente = getCliente(cpf);
        
        if (cliente == null) {
            MercadoModel.getClientes().add(new ClienteModel(name, cpf));
            return true;
        }
        
        return false;
    }
    
    public ClienteModel getCliente(String cpf) {
        return MercadoModel.getClientes().stream()
            .filter(c -> c.getCpf().equals(cpf))
            .findAny()
            .orElse(null);
    }
    
    public ClienteModel getLastCliente(String cpf) {
        return MercadoModel.getClientes().get(MercadoModel.getClientes().size() - 1);
    }
    
    public boolean addAdmin(String name, String cpf) {
        
        AdministradorModel cliente = getAdmin(cpf);
        
        if (cliente == null) {
            MercadoModel.getAdministradores().add(new AdministradorModel(name, cpf));
            return true;
        }
        
        return false;
    }
    
    public AdministradorModel getAdmin(String cpf) {
        return MercadoModel.getAdministradores().stream()
            .filter(c -> c.getCpf().equals(cpf))
            .findAny()
            .orElse(null);
    }
    
    public void addProduto(ProdutoModel produto) {
        MercadoModel.getProdutos().add(produto);
    }
    
    public ProdutoModel getProdutoById(int id) {
        return MercadoModel.getProdutos()
                .stream()
                .filter(p -> p.getId() == id)
                .findAny()
                .orElseThrow();
    }
    
    public <T> void removeProdutoById(T id){
        MercadoModel.getProdutos().removeIf(produto -> id.equals(produto.getId()));
    }
   
    public void createNFE(ClienteModel cliente, double valorTotal, String path){
        try {
            FileWriter writer = new FileWriter(new File(path + "/NF-e.txt"));
            
            writer.write("-----------------Nota Fiscal Eletronica-----------------" + "\n" + "\n");
            
            writer.write("Comprador " + cliente.getNome() + " de CPF " + cliente.getCpf() + "\n" + "\n");
            
            writer.write("-------------------Produtos Comprados-------------------" + "\n" + "\n");
            
            for (ProdutoModel produto : cliente.getProdutos()) {
                writer.write(produto.getNome() + " || " + produto.getPeso() + "Kg || R$" + produto.getValor() + "\n" + "\n");
            }
            
            writer.write("Total R$" + valorTotal);
            
            writer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo", "Arquivo com problema", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void createView(ClienteModel cliente){
        MercadoView mercado =  new MercadoView(cliente);
        mercado.setVisible(true);
    }
}

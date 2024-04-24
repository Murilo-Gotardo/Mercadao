/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murilo.mercado.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author murilo
 */
public class MercadoModel {
    
    private static List<ClienteModel> clientes = new ArrayList<>(); 
    private static List<AdministradorModel> administradores = new ArrayList<>(); 
    private static List<ProdutoModel> produtos = new ArrayList<>();

    public static List<ClienteModel> getClientes() {
        return clientes;
    }

    public static void setClientes(List<ClienteModel> clientes) {
        MercadoModel.clientes = clientes;
    }

    public static List<AdministradorModel> getAdministradores() {
        return administradores;
    }

    public static void setAdministradores(List<AdministradorModel> administradores) {
        MercadoModel.administradores = administradores;
    }
    
    public static List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public static void setProdutos(List<ProdutoModel> produtos) {
        MercadoModel.produtos = produtos;
    }

    
}

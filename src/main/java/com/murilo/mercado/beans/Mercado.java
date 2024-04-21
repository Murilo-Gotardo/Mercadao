/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murilo.mercado.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author murilo
 */
public class Mercado {
    
    private static List<Cliente> clientes = new ArrayList<>(); 
    private static List<Produto> produtos = new ArrayList<>();

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(List<Cliente> clientes) {
        Mercado.clientes = clientes;
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }

    public static void setProdutos(List<Produto> produtos) {
        Mercado.produtos = produtos;
    }

    
}

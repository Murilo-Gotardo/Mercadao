/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murilo.mercado.model;

import java.util.UUID;

/**
 *
 * @author murilo
 */
public class ProdutoModel {
    
    private int id;
    private String nome;
    private String descricao;
    private double peso;
    private double valor;

    public ProdutoModel(String nome, String descricao, double peso, double valor) {
        this.id = UUID.randomUUID().hashCode();
        this.nome = nome;
        this.descricao = descricao;
        this.peso = peso;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

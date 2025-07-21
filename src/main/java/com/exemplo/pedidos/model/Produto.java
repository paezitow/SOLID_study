package com.exemplo.pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    private String id;
    private String nome;
    private double preco;

    public Produto() {}
    public Produto(String id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}
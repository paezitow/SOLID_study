package com.exemplo.pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    @Id
    private String id;
    private String nome;

    public Cliente() {}
    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
}
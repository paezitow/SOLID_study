package com.exemplo.pedidos.model;

import jakarta.persistence.*;

@Entity
public class ItemPedido {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Produto produto;

    private int quantidade;

    public ItemPedido() {}
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }
}
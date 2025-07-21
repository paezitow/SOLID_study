package com.exemplo.pedidos.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Pedido {
    @Id
    private String id;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido() {}
    public Pedido(String id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double getTotal() {
        return itens.stream().mapToDouble(ItemPedido::getSubtotal).sum();
    }

    public String getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public List<ItemPedido> getItens() { return itens; }
}
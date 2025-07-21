package com.exemplo.pedidos.service;

import com.exemplo.pedidos.model.Pedido;

public interface PedidoService {
    Pedido criarPedido(String pedidoId, String clienteId);
    Pedido adicionarItem(String pedidoId, String produtoId, int quantidade);
}
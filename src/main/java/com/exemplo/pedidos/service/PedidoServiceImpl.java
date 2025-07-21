package com.exemplo.pedidos.service;

import com.exemplo.pedidos.model.*;
import com.exemplo.pedidos.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final ClienteRepository clienteRepo;
    private final ProdutoRepository produtoRepo;
    private final PedidoRepository pedidoRepo;

    public PedidoServiceImpl(ClienteRepository clienteRepo,
                              ProdutoRepository produtoRepo,
                              PedidoRepository pedidoRepo) {
        this.clienteRepo = clienteRepo;
        this.produtoRepo = produtoRepo;
        this.pedidoRepo = pedidoRepo;
    }

    @Transactional
    public Pedido criarPedido(String pedidoId, String clienteId) {
        Cliente cliente = clienteRepo.findById(clienteId)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        Pedido pedido = new Pedido(pedidoId, cliente);
        return pedidoRepo.save(pedido);
    }

    @Transactional
    public Pedido adicionarItem(String pedidoId, String produtoId, int quantidade) {
        Pedido pedido = pedidoRepo.findById(pedidoId)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
        Produto produto = produtoRepo.findById(produtoId)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        pedido.adicionarItem(new ItemPedido(produto, quantidade));
        return pedidoRepo.save(pedido);
    }
}
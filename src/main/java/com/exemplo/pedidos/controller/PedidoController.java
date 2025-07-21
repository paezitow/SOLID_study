package com.exemplo.pedidos.controller;

import com.exemplo.pedidos.model.Pedido;
import com.exemplo.pedidos.service.PedidoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    public Pedido criarPedido(@RequestParam String id,
                              @RequestParam String clienteId) {
        return service.criarPedido(id, clienteId);
    }

    @PostMapping("/{pedidoId}/itens")
    public Pedido adicionarItem(@PathVariable String pedidoId,
                                @RequestParam String produtoId,
                                @RequestParam int quantidade) {
        return service.adicionarItem(pedidoId, produtoId, quantidade);
    }
}
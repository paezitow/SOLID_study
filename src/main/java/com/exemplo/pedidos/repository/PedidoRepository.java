package com.exemplo.pedidos.repository;

import com.exemplo.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, String> {}
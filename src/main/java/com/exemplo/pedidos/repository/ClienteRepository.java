package com.exemplo.pedidos.repository;

import com.exemplo.pedidos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {}
package com.exemplo.pedidos.repository;

import com.exemplo.pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {}
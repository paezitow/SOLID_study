package com.exemplo.pedidos;

import com.exemplo.pedidos.model.Cliente;
import com.exemplo.pedidos.model.Produto;
import com.exemplo.pedidos.repository.ClienteRepository;
import com.exemplo.pedidos.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PedidoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PedidoApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ClienteRepository clienteRepo, ProdutoRepository produtoRepo) {
        return args -> {
            clienteRepo.save(new Cliente("1", "Hugo"));
            produtoRepo.save(new Produto("101", "Notebook", 3500.00));
            produtoRepo.save(new Produto("102", "Mouse", 150.00));
        };
    }
}
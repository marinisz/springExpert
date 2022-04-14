package org.example;

import org.example.domain.entity.Cliente;
import org.example.domain.entity.Pedido;
import org.example.domain.repositories.Clientes;
import org.example.domain.repositories.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init (@Autowired Clientes clientes,
                                   @Autowired Pedidos pedidos){
        return args -> {
            Cliente nico = new Cliente("Nico");
            clientes.save(nico);
            Pedido p = new Pedido();
            p.setCliente(nico);
            p.setDataPedido(LocalDate.now());
            p.setTotal(BigDecimal.valueOf(123));
            pedidos.save(p);
            Pedido p2 = new Pedido();
            p2.setCliente(nico);
            p2.setDataPedido(LocalDate.now());
            p2.setTotal(BigDecimal.valueOf(103));
            pedidos.save(p2);

            pedidos.findByCliente(nico).forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);
    }
}

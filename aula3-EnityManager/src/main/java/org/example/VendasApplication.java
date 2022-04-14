package org.example;

import org.example.domain.entity.Cliente;
import org.example.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init (@Autowired Clientes clientes){
        return args -> {
            clientes.salvar(new Cliente("Nico"));
            clientes.salvar(new Cliente("Paulo"));

            List<Cliente> todosClientes = clientes.obterTodos();

            todosClientes.forEach(c->{
                c.setNome(c.getNome()+" neymah");
                clientes.atualizar(c);
            });

            clientes.buscarPorNome("Ni").forEach(c->clientes.deletar(c));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);
    }
}

package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Development
public class MyConfiguration {
    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Rodando DEV");
        };
    }
}

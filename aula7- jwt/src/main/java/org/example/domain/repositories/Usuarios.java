package org.example.domain.repositories;

import org.example.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Usuarios extends JpaRepository<Usuario,Integer> {

    Optional<Usuario> findByLogin(String login);

}

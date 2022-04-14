package org.example.domain.repositories;

import org.example.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository <ItemPedido,Integer> {
}

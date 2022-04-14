package org.example.domain.repositories;

import org.example.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String nome);
    //pode fazer assim tbm o find
    @Query(value = "select * from Cliente c where c.nome like '%:nome%'",nativeQuery = true)
    List<Cliente> encontrarPeloNome(@Param("nome") String nome);

    @Query("select c from Cliente c left join fetch c.pedidos p where c.id = :id")
    Cliente findClienteFetchPedidos(@Param("id")Integer id);

    List<Cliente> findByNomeOrIdOrderById(String nome,Integer id);
    Cliente findOneByNome(String nome);
    boolean existsByNome(String nome);
}

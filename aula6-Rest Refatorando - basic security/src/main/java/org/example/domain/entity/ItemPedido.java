package org.example.domain.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "item_pedido")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="pedido_id")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;
    private Integer quantidade;

}

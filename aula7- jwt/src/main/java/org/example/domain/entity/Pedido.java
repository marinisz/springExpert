package org.example.domain.entity;

import lombok.*;
import org.example.domain.enums.StatusPedido;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="pedido")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
    @Column(name = "data_pedido")
    private LocalDate dataPedido;
    @Column(name = "total",scale = 2,precision = 20)
    private BigDecimal total;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusPedido status;
    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens;

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", dataPedido=" + dataPedido +
                ", total=" + total +
                '}';
    }
}

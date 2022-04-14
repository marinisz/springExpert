package org.example.rest.dto;

import lombok.*;
import org.example.validation.NotEmpyList;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PedidoDTO {
    @NotNull(message = "{campo.codigo-cliente.obrigatorio}")
    private Integer cliente;
    @NotNull(message = "{campo.total-pedido.obrigatorio}")
    private BigDecimal total;
    @NotEmpyList(message = "{campo.items-pedido.obrigatorio}")
    private List<ItemPedidoDTO> itens;
}

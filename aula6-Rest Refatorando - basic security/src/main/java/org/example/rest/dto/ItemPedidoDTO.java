package org.example.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.entity.Produto;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemPedidoDTO {
    private Integer produto;
    private Integer quantidade;
}

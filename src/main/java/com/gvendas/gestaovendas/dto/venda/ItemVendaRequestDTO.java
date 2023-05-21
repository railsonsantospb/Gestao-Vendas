package com.gvendas.gestaovendas.dto.venda;

import lombok.Data;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



@Data
public class ItemVendaRequestDTO {
	

	@NotNull(message = "Código produto")
	private Long codigoProduto;
	

	@NotNull(message = "Quantidade")
	@Min(value = 1, message = "Quantidade")
	private Integer quantidade;
	

	@NotNull(message = "Preço vendido")
	private BigDecimal precoVendido;

}

package com.gvendas.gestaovendas.dto.venda;

import lombok.Data;

import java.math.BigDecimal;



@Data
public class ItemVendaResponseDTO {


	private Long codigo;


	private Integer quantidade;


	private BigDecimal precoVendido;


	private Long codigoProduto;


	private String produtoDescricao;

	public ItemVendaResponseDTO(Long codigo, Integer quantidade, BigDecimal precoVendido, Long codigoProduto,
			String produtoDescricao) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.precoVendido = precoVendido;
		this.codigoProduto = codigoProduto;
		this.produtoDescricao = produtoDescricao;
	}


}

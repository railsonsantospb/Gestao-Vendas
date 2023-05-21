package com.gvendas.gestaovendas.dto.produto;

import java.math.BigDecimal;

import com.gvendas.gestaovendas.dto.categoria.CategoriaResponseDTO;
import com.gvendas.gestaovendas.entidades.Produto;
import lombok.Data;


@Data
public class ProdutoResponseDTO {


	private Long codigo;


	private String descricao;


	private Integer quantidade;


	private BigDecimal precoCusto;


	private BigDecimal precoVenda;


	private String observacao;


	private CategoriaResponseDTO categoria;

	public ProdutoResponseDTO(Long codigo, String descricao, Integer quantidade, BigDecimal precoCusto,
			BigDecimal precoVenda, String observacao, CategoriaResponseDTO categoria) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.observacao = observacao;
		this.categoria = categoria;
	}

	public static ProdutoResponseDTO converterParaProdutoDTO(Produto produto) {
		return new ProdutoResponseDTO(produto.getCodigo(), produto.getDescricao(), produto.getQuantidade(),
				produto.getPrecoCusto(), produto.getPrecoVenda(), produto.getObservacao(),
				CategoriaResponseDTO.converterParaCategoriaDTO(produto.getCategoria()));
	}


}

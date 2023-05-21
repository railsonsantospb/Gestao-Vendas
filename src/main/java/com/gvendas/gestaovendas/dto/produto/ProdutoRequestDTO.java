package com.gvendas.gestaovendas.dto.produto;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import com.gvendas.gestaovendas.entidades.Categoria;
import com.gvendas.gestaovendas.entidades.Produto;


@Data

public class ProdutoRequestDTO {


	@NotBlank(message = "Descrição")
	@Length(min = 3, max = 100, message = "Descrição")
	private String descricao;


	@NotNull(message = "Quantidade")
	private Integer quantidade;


	@NotNull(message = "Preço custo")
	private BigDecimal precoCusto;


	@NotNull(message = "Preço venda")
	private BigDecimal precoVenda;


	@Length(max = 500, message = "Observação")
	private String observacao;

	public Produto converterParaEntidade(Long codigoCategoria) {
		return new Produto(descricao, quantidade, precoCusto, precoVenda, observacao, new Categoria(codigoCategoria));
	}

	public Produto converterParaEntidade(Long codigoCategoria, Long codigoProduto) {
		return new Produto(codigoProduto, descricao, quantidade, precoCusto, precoVenda, observacao, new Categoria(codigoCategoria));
	}


}

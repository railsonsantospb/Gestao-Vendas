package com.gvendas.gestaovendas.dto.cliente;


import lombok.Data;

@Data
public class EnderecoResponseDTO {


	private String logradouro;


	private Integer numero;


	private String complemento;


	private String bairro;


	private String cep;


	private String cidade;


	private String estado;

	public EnderecoResponseDTO(String logradouro, Integer numero, String complemento, String bairro, String cep,
			String cidade, String estado) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

}

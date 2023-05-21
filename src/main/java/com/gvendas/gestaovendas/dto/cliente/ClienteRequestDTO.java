package com.gvendas.gestaovendas.dto.cliente;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import com.gvendas.gestaovendas.entidades.Cliente;
import com.gvendas.gestaovendas.entidades.Endereco;


@Data
public class ClienteRequestDTO {


	@NotBlank(message = "Nome")
	@Length(min = 3, max = 50, message = "Nome")
	private String nome;


	@NotBlank(message = "Telefone")
	@Pattern(regexp = "\\([\\d]{2}\\)[\\d]{5}[- .][\\d]{4}", message = "Telefone")
	private String telefone;


	@NotNull(message = "Ativo")
	private Boolean ativo;


	@NotNull(message = "Endereço")
	@Valid
	private EnderecoRequestDTO enderecoDto;

	public Cliente converterParaEntidade() {
		Endereco endereco = new Endereco(enderecoDto.getLogradouro(), enderecoDto.getNumero(),
				enderecoDto.getComplemento(), enderecoDto.getBairro(), enderecoDto.getCep(), enderecoDto.getCidade(),
				enderecoDto.getEstado());
		return new Cliente(nome, telefone, ativo, endereco);
	}
	
	public Cliente converterParaEntidade(Long codigo) {
		Endereco endereco = new Endereco(enderecoDto.getLogradouro(), enderecoDto.getNumero(),
				enderecoDto.getComplemento(), enderecoDto.getBairro(), enderecoDto.getCep(), enderecoDto.getCidade(),
				enderecoDto.getEstado());
		return new Cliente(codigo, nome, telefone, ativo, endereco);
	}


}

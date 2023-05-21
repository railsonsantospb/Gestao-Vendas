package com.gvendas.gestaovendas.dto.cliente;

import com.gvendas.gestaovendas.entidades.Cliente;
import lombok.Data;


@Data
public class ClienteResponseDTO {


	private Long codigo;


	private String nome;


	private String telefone;


	private Boolean ativo;

	private EnderecoResponseDTO enderecoDto;

	public ClienteResponseDTO(Long codigo, String nome, String telefone, Boolean ativo,
			EnderecoResponseDTO enderecoDto) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.ativo = ativo;
		this.enderecoDto = enderecoDto;
	}

	public static ClienteResponseDTO converterParaClienteDTO(Cliente cliente) {
		EnderecoResponseDTO enderecoResponseDTO = new EnderecoResponseDTO(cliente.getEndereco().getLogradouro(),
				cliente.getEndereco().getNumero(), cliente.getEndereco().getComplemento(),
				cliente.getEndereco().getBairro(), cliente.getEndereco().getCep(), cliente.getEndereco().getCidade(),
				cliente.getEndereco().getEstado());
		return new ClienteResponseDTO(cliente.getCodigo(), cliente.getNome(), cliente.getTelefone(), cliente.getAtivo(),
				enderecoResponseDTO);
	}




}

package com.gvendas.gestaovendas.dto.venda;

import lombok.Data;

import java.util.List;



@Data
public class ClienteVendaResponseDTO {


	private String nome;


	private List<VendaResponseDTO> vendaResponseDTOs;

	public ClienteVendaResponseDTO(String nome, List<VendaResponseDTO> vendaResponseDTOs) {
		this.nome = nome;
		this.vendaResponseDTOs = vendaResponseDTOs;
	}


}

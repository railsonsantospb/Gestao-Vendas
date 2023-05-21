package com.gvendas.gestaovendas.dto.venda;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;




@Data
public class VendaResponseDTO {


	private Long codigo;


	private LocalDate data;


	private List<ItemVendaResponseDTO> itemVendaDTOs;

	public VendaResponseDTO(Long codigo, LocalDate data, List<ItemVendaResponseDTO> itemVendaDTOs) {
		this.codigo = codigo;
		this.data = data;
		this.itemVendaDTOs = itemVendaDTOs;
	}

}

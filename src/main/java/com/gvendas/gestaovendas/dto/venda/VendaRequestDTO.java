package com.gvendas.gestaovendas.dto.venda;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;



@Data
public class VendaRequestDTO {


	@NotNull(message = "Data")
	private LocalDate data;


	@NotNull(message = "Itens venda")
	@Valid
	private List<ItemVendaRequestDTO> itensVendaDto;


}

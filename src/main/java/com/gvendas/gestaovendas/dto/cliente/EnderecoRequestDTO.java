package com.gvendas.gestaovendas.dto.cliente;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import org.hibernate.validator.constraints.Length;



@Data
public class EnderecoRequestDTO {
	

	@NotBlank(message = "Logradouro")
	@Length(min = 3, max = 30, message = "Logradouro")
	private String logradouro;


	@NotNull(message = "Número")
	private Integer numero;


	@Length(max = 30, message = "Complemento")
	private String complemento;


	@NotBlank(message = "Bairro")
	@Length(min = 3, max = 30, message = "Bairro")
	private String bairro;


	@NotBlank(message = "Cep")
	@Pattern(regexp = "[\\d]{5}-[\\d]{3}", message = "Cep")
	private String cep;


	@NotBlank(message = "cidade")
	@Length(min = 3, max = 30, message = "cidade")
	private String cidade;


	@NotBlank(message = "Estado")
	@Length(min = 3, max = 30, message = "Estado")
	private String estado;

	
}

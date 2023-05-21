package com.gvendas.gestaovendas.dto.categoria;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import com.gvendas.gestaovendas.entidades.Categoria;

@Data
public class CategoriaRequestDTO {
	

	@NotBlank(message = "Nome")
	@Length(min = 3, max = 50, message = "Nome")
	private String nome;
	
	public Categoria converterParaEntidade() {
		return new Categoria(nome);
	}
	
	public Categoria converterParaEntidade(Long codigo) {
		return new Categoria(codigo, nome);
	}
	

}

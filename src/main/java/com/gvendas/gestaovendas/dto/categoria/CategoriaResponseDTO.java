package com.gvendas.gestaovendas.dto.categoria;

import com.gvendas.gestaovendas.entidades.Categoria;
import lombok.Data;


@Data
public class CategoriaResponseDTO {


	private Long codigo;


	private String nome;	
	
	public CategoriaResponseDTO(Long codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public static CategoriaResponseDTO converterParaCategoriaDTO(Categoria categoria) {
		return new CategoriaResponseDTO(categoria.getCodigo(), categoria.getNome());
	}



}

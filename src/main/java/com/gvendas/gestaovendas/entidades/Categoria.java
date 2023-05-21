package com.gvendas.gestaovendas.entidades;

import lombok.Data;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo;

	@Column(name = "nome")
	private String nome;

	public Categoria() {
	}

	public Categoria(Long codigo) {
		this.codigo = codigo;
	}
	
	public Categoria(String nome) {
		this.nome = nome;
	}

	public Categoria(Long codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

}

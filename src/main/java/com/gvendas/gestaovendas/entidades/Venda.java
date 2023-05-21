package com.gvendas.gestaovendas.entidades;

import lombok.Data;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "venda")
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo;

	@Column(name = "data")
	private LocalDate data;

	@ManyToOne
	@JoinColumn(name = "codigo_cliente", referencedColumnName = "codigo")
	private Cliente cliente;

	public Venda() {
	}

	public Venda(Long codigo, LocalDate data, Cliente cliente) {
		this.codigo = codigo;
		this.data = data;
		this.cliente = cliente;
	}

	public Venda(LocalDate data, Cliente cliente) {
		this.data = data;
		this.cliente = cliente;
	}


}

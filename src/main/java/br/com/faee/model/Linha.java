package br.com.faee.model;

import java.math.BigDecimal;

public class Linha {

	private String descricao;
	private BigDecimal valor;

	public Linha() {
		super();
	}

	public Linha(String descricao, BigDecimal valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}

package com.fiscal.notafiscal.entity;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	
	private Integer quantidade;
	
	private BigDecimal valorUnitario;

	public Produto(String nomeProduto, Integer quantidade, BigDecimal valorUnitario) {
		this.nome = nomeProduto;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

}

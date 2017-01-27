package com.fiscal.notafiscal.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public abstract class NotaFiscal {
	
	private Integer numero;
	
	private Date dataEmissao;
	
	private List<Produto> produtos;
	
	public abstract BigDecimal calcularImposto(BigDecimal valorTotal);

	public BigDecimal getValorTotal() {
		BigDecimal valorTotal = BigDecimal.ZERO;
		
		for (Produto produto : produtos) {
			valorTotal = valorTotal.add(produto.getValorUnitario().multiply(new BigDecimal(produto.getQuantidade())));
		}
		
		return valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}

package com.fiscal.notafiscal.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.fiscal.notafiscal.entity.NotaFiscal;
import com.fiscal.notafiscal.entity.NotaFiscalPessoaFisica;
import com.fiscal.notafiscal.entity.NotaFiscalPessoaJuridica;
import com.fiscal.notafiscal.entity.Produto;

public class NotaFiscalBuilder {
	
	private NotaFiscal instancia;
	
	public NotaFiscalBuilder pessoaFisica() {
		this.instancia = new NotaFiscalPessoaFisica();
		return this;
	}
	
	public NotaFiscalBuilder pessoaJuridica() {
		this.instancia = new NotaFiscalPessoaJuridica();
		return this;
	}
	
	public NotaFiscalBuilder  definirNotaFiscal(Date dataEmissao){
		this.instancia.setDataEmissao(dataEmissao);
		return this;
	}
	
	public NotaFiscalBuilder  definirProduto(String nome, Integer quantidade, BigDecimal valor){
		Produto produto = new Produto(nome, quantidade, valor);
		
		if(instancia.getProdutos() == null){
			this.instancia.setProdutos(new ArrayList<Produto>());
		}
		
		this.instancia.getProdutos().add(produto);
		
		return this;
	}
	
	public NotaFiscalBuilderValido comNumero(Integer numero) {
		this.instancia.setNumero(numero);
		return new NotaFiscalBuilderValido(instancia);
	}

}

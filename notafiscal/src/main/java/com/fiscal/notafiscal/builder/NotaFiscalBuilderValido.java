package com.fiscal.notafiscal.builder;

import com.fiscal.notafiscal.entity.NotaFiscal;

public class NotaFiscalBuilderValido {
	
	private NotaFiscal instancia;

	public NotaFiscalBuilderValido(NotaFiscal instancia) {
		this.instancia = instancia;
	}
	
	public NotaFiscal construir(){
		return this.instancia;
	}
	
}

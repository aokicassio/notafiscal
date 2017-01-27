package com.fiscal.notafiscal.runner;

import java.math.BigDecimal;
import java.util.Date;

import com.fiscal.notafiscal.builder.NotaFiscalBuilder;
import com.fiscal.notafiscal.entity.NotaFiscal;

public class Runner {

	public static void main(String[] args) {
		NotaFiscal nota = new NotaFiscalBuilder().pessoaFisica()
				.definirNotaFiscal(new Date())
				.definirProduto("Guitarra", 1, new BigDecimal("2599.99"))
				.comNumero(1)
				.construir();
		
		System.out.print("Valor de imposto: " + nota.calcularImposto(nota.getValorTotal()));
	}

}

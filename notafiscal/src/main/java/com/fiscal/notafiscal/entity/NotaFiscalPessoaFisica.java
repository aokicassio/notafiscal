package com.fiscal.notafiscal.entity;

import java.math.BigDecimal;

public class NotaFiscalPessoaFisica extends NotaFiscal {
	
	private static final BigDecimal IMPOSTO = new BigDecimal("0.07");

	@Override
	public BigDecimal calcularImposto(BigDecimal valorTotal) {
		return valorTotal.multiply(IMPOSTO);
	}

}

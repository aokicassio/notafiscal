package com.fiscal.notafiscal.entity;

import java.math.BigDecimal;

public class NotaFiscalPessoaJuridica extends NotaFiscal{
	
	private static final BigDecimal IMPOSTO = new BigDecimal("0.04");

	@Override
	public BigDecimal calcularImposto(BigDecimal valorTotal) {
		return valorTotal.multiply(IMPOSTO);
	}

}

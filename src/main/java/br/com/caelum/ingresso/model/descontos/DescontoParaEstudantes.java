package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.Sessao;

public class DescontoParaEstudantes implements Desconto {

	@Override
	public BigDecimal aplicaDesconto(BigDecimal valor) {
		// TODO Auto-generated method stub
		return valor.multiply(new BigDecimal(0.5));
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Desconto para Estudante";
	}
}

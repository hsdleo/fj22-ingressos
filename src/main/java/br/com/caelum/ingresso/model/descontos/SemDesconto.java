package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.Sessao;

public class SemDesconto implements Desconto {

	@Override
	public BigDecimal aplicaDesconto(BigDecimal valor) {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Sem Desconto";
	}
}

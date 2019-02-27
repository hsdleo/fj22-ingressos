package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.Sessao;

public class DescontoParaEstudantes implements Desconto {

	@Override
	public BigDecimal aplicaDesconto(Sessao sessao) {
		// TODO Auto-generated method stub
		return sessao.getPreco().multiply(new BigDecimal(0.5));
	}

}

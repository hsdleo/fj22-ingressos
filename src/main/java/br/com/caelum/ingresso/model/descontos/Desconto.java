package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.Sessao;

public interface Desconto {
	BigDecimal aplicaDesconto(Sessao sessao);
}

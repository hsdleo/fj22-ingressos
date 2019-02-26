package br.com.caelum.ingresso.business;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import br.com.caelum.ingresso.model.Sessao;

public class GerenciadorDeSessao {

	private List<Sessao> sessoes;

	public GerenciadorDeSessao(List<Sessao> sessoes) {
		super();
		this.sessoes = sessoes;
	}

	public boolean cabe(Sessao sessaoNova) {
		return sessoes.stream().noneMatch(sessaoExistente -> horarioConflitante(sessaoExistente, sessaoNova));
	}

	private boolean horarioConflitante(Sessao sessaoExistente, Sessao sessaoNova) {

		LocalDate hoje = LocalDate.now();
		LocalDateTime horarioSessaoExistente = sessaoExistente.getHorario().atDate(hoje);
		LocalDateTime terminoSessaoExistente = sessaoExistente.getHorarioTermino().atDate(hoje);
		LocalDateTime horarioSessaoNova = sessaoNova.getHorario().atDate(hoje);
		LocalDateTime terminoSessaoNova = sessaoNova.getHorarioTermino().atDate(hoje);

		if (horarioSessaoNova.isEqual(horarioSessaoExistente))
			return true;
		if (horarioSessaoNova.isBefore(horarioSessaoExistente)) {
			if (terminoSessaoNova.isBefore(horarioSessaoExistente))
				return false;
			else
				return true;
		} else {
			if (terminoSessaoExistente.isBefore(horarioSessaoNova))
				return false;
			else
				return true;
		}

	}
}

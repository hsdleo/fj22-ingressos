package br.com.caelum.ingresso.model.form;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import br.com.caelum.ingresso.model.Lugar;

/**
 * Created by nando on 03/03/17.
 */
public class LugarForm {

	private Integer id;

	@NotBlank
	private String fileira;
	@NotNull
	private Integer posicao;
	private Integer salaId;

	public String getFileira() {
		return fileira;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFileira(String fileira) {
		this.fileira = fileira;
	}

	public Integer getSalaId() {
		return salaId;
	}

	public void setSalaId(Integer salaId) {
		this.salaId = salaId;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public Lugar toLugar() {
		return new Lugar(fileira, posicao);
	}

	public List<Lugar> toLugares(Integer qtd) {
		List<Lugar> lugares = new ArrayList<>();
		for (int i = 1; i <= qtd; i++)
			lugares.add(new Lugar(fileira, i));
		return lugares;
	}

}

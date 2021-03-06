package br.com.caelum.ingresso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

@Repository
public class SessaoDao {

	@PersistenceContext
	private EntityManager manager;

	public void save(Sessao sessao) {
		manager.persist(sessao);
	}

	public List<Sessao> buscaSessoesDaSala(Sala sala) {
		return manager.createQuery("select s from Sessao s where s.sala = :sala", Sessao.class)
				.setParameter("sala", sala).getResultList();
	}
	public List<Sessao> buscaSessoesDoFilme(Filme filme) {
		return manager.createQuery("select s from Sessao s where s.filme = :filme", Sessao.class)
				.setParameter("filme", filme).getResultList();
	}
	public List<Sessao> buscaSessoesDaSalaId(Integer salaId) {
		return manager.createQuery("select s fron Sessao s where s.sala.id = :salaId", Sessao.class)
				.setParameter("salaId", salaId).getResultList();
	}
	
	public Sessao findOne(Integer id) {

        return manager.find(Sessao.class, id);
    }
	
	public List<Sessao> findAll() {
        return manager.createQuery("select s from Sessao s", Sessao.class).getResultList();
    }
	
	public void delete(Integer id) {
        manager.remove(findOne(id));
    }
}

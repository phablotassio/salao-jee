package com.phablo.salao.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.phablo.salao.ejbs.interfaces.PessoaEjbLocal;
import com.phablo.salao.model.Pessoa;

@Stateless
public class PessoaEjb implements PessoaEjbLocal {

	@PersistenceContext(unitName = "cadastroDS")
    protected EntityManager entityManager;

	@Override
	public Pessoa Cadastrar(Pessoa pessoa) {
		
		return  entityManager.merge(pessoa);
	}

	@Override
	public List<Pessoa> listar() {
	
		return entityManager.createQuery("from Pessoa",Pessoa.class).getResultList();
	}
	
	
}
package com.phablo.salao.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.phablo.salao.ejbs.interfaces.FuncionarioEJbLocal;
import com.phablo.salao.model.Funcionario;

@Stateless
public class FuncionarioEjb implements FuncionarioEJbLocal {
	
	@PersistenceContext(unitName = "cadastroDS")
    protected EntityManager entityManager;

	@Override
	public Funcionario cadastrar(Funcionario funcionario) {
		
		return entityManager.merge(funcionario);
	}

	@Override
	public List<Funcionario> listar() {
		
		return entityManager.createQuery("from Funcionario",Funcionario.class).getResultList();
	}
}

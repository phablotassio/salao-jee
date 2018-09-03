package com.phablo.salao.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.phablo.salao.ejbs.interfaces.PessoaEjbLocal;
import com.phablo.salao.model.Pessoa;

@Stateless
public class PessoaService {
	
	@EJB
	private PessoaEjbLocal pessoaEjbLocal;
	
	
	public Pessoa cadastrar(Pessoa pessoa) {
		
		return pessoaEjbLocal.Cadastrar(pessoa);
		
	}


	public List<Pessoa>listarTodas() {
		
		return pessoaEjbLocal.listar();
	}
	
	

}

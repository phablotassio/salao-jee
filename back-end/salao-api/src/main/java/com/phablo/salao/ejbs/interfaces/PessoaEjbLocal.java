package com.phablo.salao.ejbs.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.phablo.salao.model.Pessoa;

@Local
public interface PessoaEjbLocal {
	
	public Pessoa Cadastrar(Pessoa pessoa);
	public List<Pessoa> listar();

}
package com.phablo.salao.ejbs.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.phablo.salao.model.Funcionario;

@Local
public interface FuncionarioEJbLocal {
	
	public Funcionario cadastrar(Funcionario funcionario);
	public List<Funcionario> listar ();
}

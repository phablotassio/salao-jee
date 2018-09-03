package com.phablo.salao.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.phablo.salao.ejbs.interfaces.FuncionarioEJbLocal;
import com.phablo.salao.model.Funcionario;

@Stateless
public class FuncionarioService {

	@EJB
	private FuncionarioEJbLocal funcionarioEJbLocal;

	public Funcionario cadastrarFuncionario(Funcionario funcionario) {

		return funcionarioEJbLocal.cadastrar(funcionario);

	}

	public List<Funcionario> listar() {

		return funcionarioEJbLocal.listar();

	}

}

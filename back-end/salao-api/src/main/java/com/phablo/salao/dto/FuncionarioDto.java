package com.phablo.salao.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.phablo.salao.model.Dias;
import com.phablo.salao.model.Funcionario;
import com.phablo.salao.model.Pessoa;

public class FuncionarioDto {
	
	@JsonIgnore
	private Pessoa pessoa;
	private List<Dias> dias;
	
	public FuncionarioDto(Pessoa pessoa, List<Dias> dias) {
		super();
		this.pessoa = pessoa;
		this.dias = dias;
	}

	@JsonIgnore
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Dias> getDias() {
		return dias;
	}

	public void setDias(List<Dias> dias) {
		this.dias = dias;
	}
	

	public static List<FuncionarioDto> funcionarioToDto(List<Funcionario> funcionarios) {
		List<FuncionarioDto> fun = new ArrayList<>();
		for(Funcionario func : funcionarios) {
			fun.add(new FuncionarioDto(func.getPessoa(), func.getDias()));
		}
		
		
		return fun;
		
	}
	
	
	
	
}

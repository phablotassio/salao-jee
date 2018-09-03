package com.phablo.salao.controller;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.phablo.salao.model.Funcionario;
import com.phablo.salao.service.FuncionarioService;

@Stateless
@Path("/funcionario")
public class FuncionarioController {

	@EJB
	private FuncionarioService funcionarioService;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response cadastrarFuncionario(Funcionario funcionario) {

		return Response.ok(funcionarioService.cadastrarFuncionario(funcionario)).build();

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar() {

		return Response.ok(funcionarioService.listar()).build();
	}

}

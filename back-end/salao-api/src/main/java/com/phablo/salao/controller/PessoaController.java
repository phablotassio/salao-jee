package com.phablo.salao.controller;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.phablo.salao.model.Pessoa;
import com.phablo.salao.service.PessoaService;

@Stateless
@Path("/pessoa")
public class PessoaController {
	
	@EJB
	private PessoaService pessoaService;

	@Produces(MediaType.APPLICATION_JSON)
	@POST
	public Response cadastrarPessoa(Pessoa pessoa) {
		
		return Response.ok().entity(pessoaService.cadastrar(pessoa)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response teste() {
		return Response.ok(pessoaService.listarTodas()).build();
	}
	
}
package com.vacinaja.service;


import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;

import com.vacinaja.DTO.FuncionarioDTO;
import com.vacinaja.model.Funcionario;

public interface FuncionarioService {
	
	public Optional<Funcionario> getFuncionarioByCpf(String cpf);
	
    public void salvarFuncionario(Funcionario funcionario);

    public void cadastrarFuncionario(FuncionarioDTO funcionarioDTO);

	public List<Funcionario> listarFuncionariosNaoAprovados();

	public void removerFuncionario(String cpf);

	public boolean validarRequisicao(String header) throws ServletException;
	
	public String getIdRequester(String header) throws ServletException ;

}

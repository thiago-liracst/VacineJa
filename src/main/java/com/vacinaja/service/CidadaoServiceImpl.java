package com.vacinaja.service;

import com.vacinaja.DTO.CidadaoDTO;
import com.vacinaja.model.Cidadao;
import com.vacinaja.model.situacoes.EnumSituacoes;
import com.vacinaja.repository.CidadaoRepository;


import java.util.List;

import java.util.Optional;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CidadaoServiceImpl implements CidadaoService{

    @Autowired
    CidadaoRepository cidadaoRepository;
    
    @Autowired
    JwtService jwtService;

    @Override
    public Optional<Cidadao> getCidadaoByCpf(String cpf) {
        return cidadaoRepository.findById(cpf);
    }

    @Override
    public void removerCidadao(Cidadao cidadao) {
        cidadaoRepository.delete(cidadao);
        
    }

    @Override
    public void salvarCidadao(Cidadao cidadao) {
        cidadaoRepository.save(cidadao);
        
    }

    @Override
    public void cadastrarCidadao(CidadaoDTO cidadaoDTO) {
        Cidadao cidadao = new Cidadao(cidadaoDTO.getCpf(), cidadaoDTO.getNome(), cidadaoDTO.getDataNasc(), cidadaoDTO.getCartaoSus(), 
        cidadaoDTO.getTelefone(), cidadaoDTO.getEmail(), cidadaoDTO.getProfissao(), cidadaoDTO.getComorbidades(), cidadaoDTO.getSenha());
        cidadaoRepository.save(cidadao);
    }

    @Override
    public void atualizarCidadao(CidadaoDTO cidadaoDTO, Cidadao cidadao) { 
        cidadao.setNome(cidadaoDTO.getNome());
        cidadao.setDataNasc(cidadaoDTO.getDataNasc());
        cidadao.setCartaoSus(cidadaoDTO.getCartaoSus());
        cidadao.setTelefone(cidadaoDTO.getTelefone());
        cidadao.setEmail(cidadaoDTO.getEmail());
        cidadao.setProfissao(cidadaoDTO.getProfissao());
        cidadao.setComorbidades(cidadaoDTO.getComorbidades());
    }

	@Override
	public boolean validarUsuarioSenha(String cpf, String senha) {
		Optional<Cidadao> optionalCidadao = getCidadaoByCpf(cpf);
		
		if (!optionalCidadao.isPresent()) {
			return false;
		}
		
		
		
		Cidadao cidadao = optionalCidadao.get();
		return cidadao.getSenha().equals(senha);

	}

	@Override
	public boolean validarRequisicao(String header,String cpf) throws ServletException {
		String idRequester = getIdRequester(header);
		if (!idRequester.equals(cpf)) {
			return false;
		}
		Optional<Cidadao> optionalCidadao = cidadaoRepository.findById(idRequester);
		Cidadao cidadao = optionalCidadao.get();
		return validarUsuarioSenha(cidadao.getCpf(), cidadao.getSenha());
		
		
	}
	
	 @Override
	 public List<Cidadao> getCidadaosBySituacao(EnumSituacoes situacao) {
	        return cidadaoRepository.findBySituacao(situacao);
	 }

	@Override
	public String getIdRequester(String header) throws ServletException {
		return jwtService.getIdbyToken(header);
	}
	

}
    

  

    

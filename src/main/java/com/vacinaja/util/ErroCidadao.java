package com.vacinaja.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.vacinaja.DTO.CidadaoDTO;
import com.vacinaja.model.Cidadao;

public class ErroCidadao {

    static final String CIDADAO_NAO_CASTRADO = "Cidadao com cpf %s não está cadastrado.";
	
	static final String CIDADAOS_NAO_CASTRADOS = "Não há cidadãos cadastrados.";

	static final String NAO_FOI_POSSIVEL_ATUALIZAR_CIDADAO = "Não foi possível atualizar a situação do cidadão de cpf %s.";

	static final String CIDADAO_JA_CADASTRADO = "O cidadão com cpf %s já esta cadastrado";
    


    public static ResponseEntity<CustomErrorType> erroCidadaoNaoEncontrado(String cpf) {
		return new ResponseEntity<CustomErrorType>(new CustomErrorType(String.format(ErroCidadao.CIDADAO_NAO_CASTRADO, cpf)),
				HttpStatus.NOT_FOUND);
	}
	
	public static ResponseEntity<CustomErrorType> erroSemCidadaosCadastrados() {		
		return new ResponseEntity<CustomErrorType>(new CustomErrorType(ErroCidadao.CIDADAOS_NAO_CASTRADOS),
				HttpStatus.NO_CONTENT);
	}

	public static ResponseEntity<?> erroAtualizarCidadao(String cpf) {
		return new ResponseEntity<CustomErrorType>(new CustomErrorType(String.format(ErroCidadao.NAO_FOI_POSSIVEL_ATUALIZAR_CIDADAO, cpf)),
         HttpStatus.NOT_MODIFIED);
	}
	
	public static ResponseEntity<?> erroCidadaoJaCadastrado(String cpf) {
		return new ResponseEntity<CustomErrorType>(new CustomErrorType(String.format(ErroCidadao.CIDADAO_JA_CADASTRADO,
				cpf)), HttpStatus.CONFLICT);
	}
}
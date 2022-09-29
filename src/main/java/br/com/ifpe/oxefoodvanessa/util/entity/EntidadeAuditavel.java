package br.com.ifpe.oxefoodvanessa.util.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass

public abstract class EntidadeAuditavel extends EntidadeNegocio {
	
	private static final long serialVersionUID = -1400577277907970638L;

	private Long versao;
	
	private LocalDate dataCriacao;
	
	private LocalDate dataUltimaModificacao;
	
	private Long criadoPor;//id do usuário que o criou
	
	private Long ultimaModificacaoPor;

}

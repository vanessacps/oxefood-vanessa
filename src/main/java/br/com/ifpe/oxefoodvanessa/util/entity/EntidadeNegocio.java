package br.com.ifpe.oxefoodvanessa.util.entity;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(of = {"id"})


public class EntidadeNegocio implements Serializable {
	
	private Long id;
	
	private Boolean habilitado;
	

}

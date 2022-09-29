package br.com.ifpe.oxefoodvanessa.modelo.produto;

import br.com.ifpe.oxefoodvanessa.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class CategoriaProduto extends EntidadeAuditavel{
	
	private static final long serialVersionUID = -1200408901069833835L;

	private String chaveEmpresa;
	
	private String descricao;
	

}

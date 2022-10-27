package br.com.ifpe.oxefoodvanessa.modelo.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefoodvanessa.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cliente")
@Where(clause = "habilitado = true")
public class Cliente extends EntidadeAuditavel {
    
    private static final long serialVersionUID = -8278376605226570298L;

    @NotNull
    @Column(nullable = false)
    private String chaveEmpresa;
    
    @Column
    private String nome;
    
    @Column
    private String cpf;
    
    @Column
    private String fone;
    
    @Column
    private String foneAlternativo;
    
}

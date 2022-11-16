package br.com.ifpe.oxefoodmanha.modelo.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaProdutoRepository
	extends JpaRepository<CategoriaProduto, Long>, JpaSpecificationExecutor<CategoriaProduto> {
    
    List<CategoriaProduto> findByChaveEmpresaOrderByDescricaoAsc(String chaveEmpresa);
    
    @Query(value = "SELECT c FROM CategoriaProduto c WHERE c.chaveEmpresa = :chaveEmpresa AND c.descricao = :descricao")
    CategoriaProduto findByChaveAndDescricao(String chaveEmpresa, String descricao);

}
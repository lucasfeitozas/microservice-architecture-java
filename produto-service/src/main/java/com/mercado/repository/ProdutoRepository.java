package com.mercado.repository;

import org.springframework.data.repository.CrudRepository;

import com.mercado.domain.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
	Produto findByProdutoId(Integer produtoId);
}

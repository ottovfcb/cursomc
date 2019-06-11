package com.otto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otto.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
}

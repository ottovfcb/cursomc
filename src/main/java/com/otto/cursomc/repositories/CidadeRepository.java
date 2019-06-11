package com.otto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otto.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}

package com.izabelvidal.cursoMC.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.izabelvidal.cursoMC.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	@Transactional
	Cliente finfByEmail(String emai);
}

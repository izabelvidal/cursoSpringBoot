package com.izabelvidal.cursoMC.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.izabelvidal.cursoMC.domain.Cliente;
import com.izabelvidal.cursoMC.repositories.ClienteRepository;
import com.izabelvidal.cursoMC.services.exceptions.ObjectNotFoundException;

public class ClienteService {
	@Autowired
	private ClienteRepository repo;
	public Cliente find(Integer id) {
		 Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		 "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
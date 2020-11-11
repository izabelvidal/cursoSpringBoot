package com.izabelvidal.cursoMC.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.izabelvidal.cursoMC.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat = new Categoria(1, "informática");
		Categoria cat2 = new Categoria(2, "escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat);
		lista.add(cat2);
		return lista;
	}
}

package com.deivson.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deivson.cursomc.domain.Categoria;
import com.deivson.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	
	}

}

package com.deivson.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deivson.cursomc.domain.Pedido;
import com.deivson.cursomc.repositories.PedidoRepository;
import com.deivson.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Pedido obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: "
					+id + ", Tipo " + Pedido.class.getName());
			
		}
		return obj;
	
	}

}

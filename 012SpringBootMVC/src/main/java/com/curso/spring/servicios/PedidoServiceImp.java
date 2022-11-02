package com.curso.spring.servicios;



import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.repositorio.PedidoRepository;

@Service
public class PedidoServiceImp implements PedidosService {
	

	private static Logger log = LoggerFactory.getLogger(PedidoServiceImp.class);
	
	@Autowired
	@Qualifier("pedidoRepo")
	private PedidoRepository repo;

	public PedidoServiceImp() {
		log.info(".....instanciando PedidoServiceImp" + repo);
	}
	
	@Override
	public void generarPedido(Pedido p) {
		log.info("gestiono un pedido");
		repo.add(p);
	}

	@Override
	public Collection getPedidos(String user) {
		return repo.getPedidoByUser(user);
	}

}

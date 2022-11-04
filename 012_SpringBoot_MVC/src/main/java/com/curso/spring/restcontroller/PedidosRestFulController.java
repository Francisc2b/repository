package com.curso.spring.restcontroller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.servicios.PedidosService;


@Controller
public class PedidosRestFulController {	

	@Autowired
	private PedidosService pedidoService;
	
	//get all
	@GetMapping("/ws/pedidos")
	public Collection<Pedido> all(){		
		return pedidoService.getPedidos(null);	
	}
	
	//get by id

	
	//insert
	
	
	
	//delete
	
	
	//update
	

}

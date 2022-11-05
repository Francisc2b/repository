package com.curso.spring.servicios;

import java.util.Collection;

import com.curso.spring.entidades.Pedido;

public interface PedidosService {
	
	Pedido generarPedido(Pedido p);
	Collection<Pedido> getPedidos(String user);
	Pedido getPedido(Integer id);

}

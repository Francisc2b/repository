package com.curso.spring.servicios;

import java.util.Collection;

import com.curso.spring.entidades.Pedido;

public interface PedidosService<T> {
	
	void generarPedido(Pedido p);
	Collection<Pedido> getPedidos(String user);

}

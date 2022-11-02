package com.curso.spring.servicios;

import com.curso.spring.entidades.Pedido;

public interface PedidosService<T> {
	
	void generarPedido(Pedido p);

}

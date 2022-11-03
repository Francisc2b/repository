package com.curso.spring.servicios;

import java.util.Collection;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.entidades.Usuario;

public interface UsuariosService {
	
	Collection<Usuario> getUsuarios();
	Usuario getUsuarioByNombre(String nombre);

}

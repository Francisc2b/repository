package com.curso.spring.repositorio;

import java.util.Collection;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.entidades.Usuario;


public interface UsuarioRepository {
	
	void add(Usuario usuario);
	Collection<Usuario> getAll();
	Usuario getById(Integer id);

}

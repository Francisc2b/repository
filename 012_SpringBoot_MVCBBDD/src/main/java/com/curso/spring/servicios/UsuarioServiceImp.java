package com.curso.spring.servicios;

import java.util.Collection;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.entidades.Usuario;
import com.curso.spring.repositorio.PedidoJPARepository;
import com.curso.spring.repositorio.PedidoRepository;
import com.curso.spring.repositorio.UsuarioJPARepository;

@Service
//@Scope(value = "singleton")
//@Lazy
public class UsuarioServiceImp implements UsuariosService {

	private static Logger log = LoggerFactory.getLogger(UsuarioServiceImp.class);
	
	
	@Autowired
	private UsuarioJPARepository repoJPA;

	@Override
	public Collection<Usuario> getUsuarios() {		
			return repoJPA.findAll();	
	}

	@Override
	public Usuario getUsuarioByNombre(String nombre) {
		return repoJPA.findByNombre(nombre);
	}

}

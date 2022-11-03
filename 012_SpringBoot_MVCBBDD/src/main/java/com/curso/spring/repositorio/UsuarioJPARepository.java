package com.curso.spring.repositorio;


import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.curso.spring.entidades.Usuario;

@Repository
public interface UsuarioJPARepository 
       extends JpaRepository<Usuario, Integer> {
	
	public static Logger log = LoggerFactory.getLogger(UsuarioJPARepository.class);
		
	Usuario findByNombre(String nombre);
	
	
}





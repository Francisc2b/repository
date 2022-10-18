package com.curso.db;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import com.curso.mercado.entidades.Usuario;

public class BaseDatosUsuario {
	
	private static Map<Integer, String> tablaUsuario;
	private static int contador = 3;
	
	static {
		tablaUsuario = new TreeMap<Integer, String>();
		tablaUsuario.put(1, new Usuario(1, "Juan", "admin"));

	public BaseDatosUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Collection<Usuario> getAll(){
		return tablaUsuario.values();		
	}

}

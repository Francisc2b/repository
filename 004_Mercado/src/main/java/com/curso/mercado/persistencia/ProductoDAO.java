package com.curso.mercado.persistencia;

import java.util.List;

import com.curso.db.BaseDatosMercado;
import com.curso.mercado.entidades.Producto;

public class ProductoDAO implements GenericDAO<Producto> {

	@Override
	public void add(Producto entidad) {
		BaseDatosMercado.add(entidad.getDescripcion(), entidad.getPrecio());
		
	}

	@Override
	public List<Producto> getAll() {
		// TODO crear y devolver una lista de productos
		return null;
	}

	@Override
	public Producto getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.curso.bank.persistencia;

import java.util.List;


public interface GenericDAO<T> {
	
	
	public List<T> getAll();
	public T getByID(int id);

}

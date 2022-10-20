package com.curso.bank.servicios;

import java.util.List;

import com.curso.bank.entidades.Bank;
import com.curso.bank.entidades.Customer;
import com.curso.bank.persistencia.BankMemoriaDAO;
import com.curso.bank.persistencia.GenericDAO;

public class ClientesService {
	
	GenericDAO<Bank> dao = new BankMemoriaDAO();	

	
	public List<Bank> listaClientes(){
		return dao.getAll();
		
	}
	
	
	
	
}

package com.mybank.pruebas;

import com.mybank.domain.Bank;
import com.mybank.domain.Customer;

public class TestBanking2 {

	public static void main(String[] args) {
		
		Bank banco = new Bank();
		
		banco.getCustomers();
		banco.addCustomer("Jose", "Pérez");
		banco.addCustomer("Ana", "Garcia");
		banco.addCustomer("Ana", "Garcia");
		System.out.printf("El banco tiene:  %s clientes%n", banco.getNumberOfCustomerss());
		Customer[] customers = banco.getCustomers();
		for (Customer c : customers) {
			System.out.println(c);
		}
		
	

	}

}

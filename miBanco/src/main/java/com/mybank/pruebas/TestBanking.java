package com.mybank.pruebas;

import com.mybank.domain.Account;
import com.mybank.domain.Customer;

public class TestBanking {

	public static void main(String[] args) {

		Customer cliente = new Customer("Luis", "Ramos");
		System.out.printf("Creando el cliente %s %s %n", cliente.getFirstName(), cliente.getLastName());

		Account cuenta = new Account(500.00);
		System.out.printf("Creando su cuenta bancaria con saldo %f %n", cuenta.getBalance());

		System.out.println("Sacar 150");
		cuenta.withdraw(150);
		System.out.printf("Su saldo es %f %n", cuenta.getBalance());

		System.out.println("ingreso 22.50");
		cuenta.deposit(22.50);
		System.out.printf("Su saldo es %f %n", cuenta.getBalance());
		
		System.out.println("Sacar 47.62");
		cuenta.withdraw(47.62);
		System.out.printf("Su saldo es %f %n", cuenta.getBalance());
		
		System.out.println("Sacar 400");
		cuenta.withdraw(400);
		System.out.printf("Su saldo es %f %n", cuenta.getBalance());
		

		Customer cliente2 = new Customer("Jane", "Smith");
		Account cuenta2 = new Account(324.88);
		System.out.printf("El cliente %s %s tiene un saldo de %f", cliente2.getFirstName(), cliente2.getLastName(), cuenta2.getBalance());
	}

}

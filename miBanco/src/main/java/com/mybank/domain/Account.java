package com.mybank.domain;

public class Account {

    private double balance;

	public Account(double initBalance) {
		super();
		this.balance = initBalance;
	}

	public double getBalance() {
		return balance;
	}
    
	public boolean deposit (double amt)
    {
		balance = balance + amt;
		return true;
    }
	
	public boolean withdraw(double amt){	      

		boolean result = false;
		if ( balance >= amt ) {
		balance = balance - amt;
		result = true;
		} else {
			System.out.println("No puede sacar una cantidad mayor al saldo actual");
		}
		return result;
        
   }
   

}

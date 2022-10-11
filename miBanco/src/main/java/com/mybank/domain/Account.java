package com.mybank.domain;

public class Account {

    protected double balance;
    protected SavingsAccount saving;

	protected Account(double initBalance) {
		balance = initBalance;
	}

	public double getBalance() {
		return balance;
	}
    
	public boolean deposit (double amt)
    {
		balance = balance + amt;
		return true;
    }
	
	
	
	public SavingsAccount getSaving() {
		return saving;
	}

	public boolean withdraw(double amt){	
		
		 boolean result = false; 
	        if ( amt <= balance ) {
	            balance = balance - amt;
	            result = true;
	        }
	        return result;
        
   }
   

}

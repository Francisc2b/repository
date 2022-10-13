package com.mybank.pruebas;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

public class TestBanking4 {

	public static void main(String[] args) {
		
		Bank banco = new Bank();
	    Customer cliente;
	    Account cuenta;
	    
	    System.out.println("Creating the customer Jane Smith.");
	    banco.addCustomer("Jane", "Smith");
	    cliente = banco.getCustomer(0);
	    System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
	    cliente.setAccount(new SavingsAccount(500.00, 0.03));
	    //System.out.printf(cliente.getFirstName() + cliente.getAccount().getSaving().getInterestRate());
	    
	    
	 
	    
	    /*
	     * Creating the customer Jane Smith.
Creating her Savings Account with a 500.00 balance and 3%
interest.
Creating the customer Owen Bryant.
Creating his Checking Account with a 500.00 balance and 
no overdraft
protection.
Creating the customer Tim Soley.
Creating his Checking Account with a 500.00 balance and 
500.00 in
overdraft protection.
Creating the customer Maria Soley.
Maria shares her Checking Account with her husband Tim.
Retrieving the customer Jane Smith with her savings 
account.
Withdraw 150.00: true
Deposit 22.50: true
Withdraw 47.62: true
Withdraw 400.00: false
Customer [Simms, Jane] has a balance of 324.88
Retrieving the customer Owen Bryant with his checking 
account with no
overdraft protection.
Withdraw 150.00: true
Deposit 22.50: true
Withdraw 47.62: true
Withdraw 400.00: false
Customer [Bryant, Owen] has a balance of 324.88
Retrieving the customer Tim Soley with his checking 
account that has
overdraft protection.
Withdraw 150.00: true
Deposit 22.50: true
Withdraw 47.62: true
Withdraw 400.00: true
Customer [Soley, Tim] has a balance of 0.0
Retrieving the customer Maria Soley with her joint 
checking account with
husband Tim.
Deposit 150.00: true
Withdraw 750.00: false
Customer [Soley, Maria] has a balance of 150.0
	     */

	}

}

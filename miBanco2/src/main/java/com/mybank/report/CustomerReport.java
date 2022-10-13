package com.mybank.report;

import com.mybank.domain.*;

public class CustomerReport {
    
    public CustomerReport() {
    }
    
    public void generateReport() {
        
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");
        
        for ( int cust_idx = 0;
        cust_idx < Bank.getNumOfCustomers();
        cust_idx++ ) {
            Customer customer = Bank.getCustomer(cust_idx);
            
            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());
            
            for ( int acct_idx = 0;
            acct_idx < customer.getNumOfAccounts();
            acct_idx++ ) {
                Account account = customer.getAccount(acct_idx);
                String  account_type = "";
                
                if ( account instanceof SavingsAccount ) {
                    account_type = "Savings Account";
                } else if ( account instanceof CheckingAccount ) {
                    account_type = "Checking Account";
                } else {
                    account_type = "Unknown Account Type";
                }
                
                System.out.println("    " + account_type + ": current balance is "
                        + account.getBalance());
            }
        }
    }
}

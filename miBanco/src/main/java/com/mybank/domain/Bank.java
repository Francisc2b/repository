package com.mybank.domain;

public class Bank {
	

	
	private  Customer[] customers;
	private  int numberOfCustomers;
	
	
	public Bank() {
		customers = new Customer[8];
		numberOfCustomers = 0;
		}
	
	public Bank(Customer[] customers, int numberCustomers) {
		super();
		this.customers = customers;
		this.numberOfCustomers = numberCustomers;
	}
	
	public Customer[] getCustomers() {
		return customers;
	}
	
	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}
	
	public int getNumberOfCustomerss() {
		return numberOfCustomers;
	}
	
	public void setNumberOfCustomers(int numberCustomers) {
		this.numberOfCustomers = numberCustomers;
	}
	
	public void addCustomer(String firstName, String lastName ) {
		int i = numberOfCustomers++;
		customers[i] = new Customer(firstName, lastName);
	}
	

}

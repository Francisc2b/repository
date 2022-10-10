package com.curso.modulo7;

public class Counter {

	private int serialNumber;
	 public static int counter = 0;

	 public Counter() {
		 this.serialNumber = ++counter;
	 } 
	 
	 public int getSerialNumber() {
		return serialNumber;
	}

	 

	public static int getCounter() {
		return counter;
	}


	public static void main(String[] args) {
		 System.out.printf("counter vale %d %n", Counter.counter);
		 Counter c1 = new Counter();
		 Counter c2 = new Counter();
		 Counter c3 = new Counter();
		 
		 c1.counter++;

		 System.out.printf("counter vale %d %n", Counter.counter);
		 System.out.printf("serialNumber vale %d %n", c1.serialNumber);
		 
	 }
	 
}

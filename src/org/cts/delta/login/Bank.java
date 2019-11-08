package org.cts.delta.login;

public abstract class Bank{
	
	//Non - Abstract Methods
	public void savAcc() {
		System.out.println("Savings");

	}
	
	public void fixedDeposit() {
		System.out.println("Fixed");

	}
	
	//Abstract Methods
	
	public abstract void mmsAccount();
	
	public abstract void smallBusiness();
 
	

}

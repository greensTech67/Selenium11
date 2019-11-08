package org.cts.delta.login;

public class Hdfc extends Bank {
	
	private void jointAcc() {
		System.out.println("8%");
	}
	
	private void branchDetails() {
		System.out.println("Chennai");

	}
	
	
	
	
	public static void main(String[] args) {
		
		Hdfc h = new Hdfc();
		h.jointAcc();
		h.branchDetails();
		h.mmsAccount();
		h.smallBusiness();
		h.savAcc();
		
		
	}

	
	public void mmsAccount() {
		System.out.println("MMS account");
		
	}

	
	public void smallBusiness() {
		System.out.println("SB");
		
	}

}

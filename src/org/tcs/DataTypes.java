package org.tcs;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//nextLine
		System.out.println("Enter your name:");
		String nl = sc.nextLine();
		System.out.println("My name is:" +nl);
		
		//next
		System.out.println("Enter your fiest name");
		String n = sc.next();
		System.out.println("First name is:" +n);
		
		//nextLong
		
		System.out.println("Enter phn no:");
		long nl1 = sc.nextLong();
		System.out.println("Phn no: " +nl1);
		
		//nextDouble
		
		System.out.println("Enter avg:");
		double nd = sc.nextDouble();
		System.out.println("Avg value:" +nd);
		
		//nextFloat
		System.out.println("Enter salary");
		float nf = sc.nextFloat();
		System.out.println("Salry value:" +nf);
		
		//nextBoolean
		System.out.println("Emploee status:");
		boolean nb = sc.nextBoolean();
		System.out.println("Emploee status:" +nb);
		
		
		

	}

}

package org.tcs;

import org.cts.delta.login.*;


public class ClientDetails {
	
	private void cliName() {
		System.out.println("TMK");

	}
	
	private void cliId() {
		System.out.println(7890);

	}
	public static void main(String[] args) {
		
	
	ClientDetails cl = new ClientDetails();
	cl.cliName();
	cl.cliId();
	
	CourseDetails c = new CourseDetails();
	c.javaCourse();
	c.oracleCourse();
	
	
	EmployeeDetails emp = new EmployeeDetails();
	emp.empName();
	

}
}
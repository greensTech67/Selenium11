package org.cts.delta.login;

public class EmployeeDetails extends CourseDetails {
	
	public void empName() {
		System.out.println("Anu");

	}
	
	private void empId() {
		System.out.println(12345);

	}
	
	public static void main(String[] args) {
		
	
	
	EmployeeDetails emp = new EmployeeDetails();
	
	emp.empName();
	emp.empId();
	
	emp.javaCourse();
	emp.oracleCourse();
	
	

}
}
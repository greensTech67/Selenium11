package org.cts.delta.login;

public class Mo {
	
	//Depends on DataType
	
	private void findEmployeeDetails(int empId) {
		
		System.out.println(empId);
		

	}
	//Depends on Order
	private void findEmployeeDetails(int empId, String name) {
		System.out.println("Employee id and name:" +empId +" " +name);

	}
	
	private void findEmployeeDetails(String name, int empId) {
		System.out.println("Employee id and name:" +name +" " +empId);

	}
	
	//Depends on Count
	
	private void findEmployeeDetails(String name, int empId, float sal, boolean isEmp) {
		System.out.println("Employee id and name:" +name +" " +empId +" " +sal +" " +isEmp);

	}
	
	public static void main(String[] args) {
		Mo m = new Mo();
		m.findEmployeeDetails(678);
		m.findEmployeeDetails(234, "Saranya");
		m.findEmployeeDetails("Anu", 1234);
		m.findEmployeeDetails("Kavya", 23467, 8655.67f, true);
	}

}

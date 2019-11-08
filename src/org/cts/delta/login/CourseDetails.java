package org.cts.delta.login;

public class CourseDetails {
	
	public void javaCourse() {
		System.out.println("Java");

	}
	
	
	public void oracleCourse() {
		System.out.println("Oracle");

	}
	
	private void seleniumCourse() {
		System.out.println("Selenium");

	}
	
	public static void main(String[] args) {
		//Create an object ==== ClassName obj/Ref Name = new ClassName();
		
		CourseDetails obj = new CourseDetails();
		
		//Call the methods ==== ObjName.MethodName
		
		obj.javaCourse();
		obj.oracleCourse();
		obj.seleniumCourse();
	}
	
	

}


package com.javalearn.oops.level2.inheritance;

public class StudentMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee("David", "Mathematical Researcher");
		employee.setEmail("idajilid@gmail.com");
		employee.setPhoneNumber("+2348119903792");
		employee.setEmployeeGrade('A');
		employee.setTitle("Mathematical Researcher");
		
		System.out.print(employee);
		
	}
}

package com.javalearn.arrays;

import java.math.BigDecimal;

public class StudentMain {

	public static void main(String[] args) {
				
		Student student = new Student("David", 90, 50, 25);
				
		int number = student.getNumberOfMarks();
		System.out.println("number of marks : " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks : " + sum);
		
		int maximumMark = student.getMaximumMark();
		System.out.println("maximum of marks : " + maximumMark);
		
		int minimumMark = student.getMinimumMark();
		System.out.println("minimum of marks : " + minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("average : " + average);
		
		System.out.println(student);
		
		student.addNewMark(35);
		
		System.out.println(student);

		student.removeMarkAtIndex(1);
		
		System.out.println(student);
		
	}

}

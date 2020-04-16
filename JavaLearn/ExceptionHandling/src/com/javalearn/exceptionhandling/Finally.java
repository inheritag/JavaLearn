package com.javalearn.exceptionhandling;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			int[] numbers = { 12, 3, 4, 5 };

			int number = numbers[21];

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Before Scanner Closes");
			if(scanner!=null) {
				scanner.close();
			}
		}
		
		System.out.println("Just before closing main");
	}

}

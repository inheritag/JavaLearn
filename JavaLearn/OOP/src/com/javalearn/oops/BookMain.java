package com.javalearn.oops;

public class BookMain {

	public static void main(String[] args) {
		
		Book artOfComputerProgramming = new Book(17);
		Book effectiveJava = new Book(18);
		Book cleanCode = new Book(20);
		
		artOfComputerProgramming.setNoOfCopies(5);
		int ans = artOfComputerProgramming.getNoOfCopies();
		System.out.println(ans);
	}

}

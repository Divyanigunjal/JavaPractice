package com.java.demo.intro;

public class LargeNo {
	public static void main(String[] args) {

	       int n1 = 4, n2 = 3, n3 = 5;

	        if( n1 >= n2 && n1 >= n3) {
	            System.out.println(n1 + " is the largest number.");
	        }

	        else if (n2 >= n1 && n2 >= n3) {
	            System.out.println(n2 + " is the largest number.");
	        }
	        else {
	            System.out.println(n3 + " is the largest number.");
	    }
	}

}

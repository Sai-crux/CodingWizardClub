package soaCodingCLub;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// Write a program to find the maximum of three numbers without using third variable.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter first number: ");
		int b = sc.nextInt();
		System.out.print("Enter first number: ");
		int c = sc.nextInt();
		
		if(a > b && a > c) {
				System.out.println(a + " is the maximum number between  " + a + " , "+ b + " and "+ c);
				
		} else if ( b > c) {
			System.out.println(b + " is the maximum number between  " + a + " , "+ b + " and "+ c);
		} else {
			System.out.println(c + " is the maximum number between  " + a + " , "+ b + " and "+ c);
		}

	}
	}
	



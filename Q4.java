package soaCodingCLub;

import java.util.Scanner;

public class Q4 {
	// Write a program to input a number and check if it is an Automorphic number or not.
	 public static void  main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		int n = sc.nextInt();
		int temp = n;
		int a = 0;
		
		int sqOfNum = (int) Math.pow(n, 2);
		System.out.println("The square of the number is: " + sqOfNum);
		
		while(temp>0) {
	   			a++;
				temp /= 10;
				}
			
			int lastDigits = (int) (sqOfNum%Math.pow(10, a));
			
			if(n == lastDigits) {
				System.out.println("Thus " + n + " is an Automorphic number");
			} else {
				System.out.println("Thus " + n + " is not an Automorphic number");
			}
		}

	}



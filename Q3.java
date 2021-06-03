package soaCodingCLub;

import java.util.Scanner;

public class Q3 {
//	Write a program to print the following series: 0, 1, 1, 2, 4, 7, 13, . . . . upto n.
	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		
		int a = 0 ; 
		int b = 1;
		int c = 1;
		int d = 0;
		System.out.print(a + " " + b + " " + c);
		
		for(int i = 2; i <= n-2 ; i++) {
			
			d = a + b + c;
			System.out.print(" " + d);
			
			a = b;
			b = c;
			c = d;
		}

	}

}

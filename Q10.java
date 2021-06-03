package soaCodingCLub;

import java.util.Scanner;

public class Q10 {
	// Write a program that accepts an integer (n) and computes the value of n+nn+nnn.
	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int temp = n;
		int x = 0;
		while(temp != 0) {
			temp/=10;
			++x;
		}
		
		
		int a = (int)(n*(Math.pow(10,x))) + n;
		int b = (int)(n*(Math.pow(10, 2*x))) + (int)(n*(Math.pow(10,x))) + n;
		
		int sum = n + a + b;
		
		System.out.println("The value of n+nn+nnn = " + sum);
		
	}

}

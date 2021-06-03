package soaCodingCLub;

import java.util.Scanner;

public class Q9 {
//	Write a program to reverse a string.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
				
		char[] strToChar = input.toCharArray();
 
        for (int i = strToChar.length-1; i >= 0; i--) {
            System.out.print(strToChar[i]);
        }
    }
}





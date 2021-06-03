package soaCodingCLub;

import java.util.Scanner;

public class Q7 {
	/*You have a variable i and when i=1 output is 3,for i=2 output is 8 and for i=3 output is 13.
	  You have to find for which value of i output is 78? Condition: Without using any loop
	  Consindering it to be a series of 3, 8, 13...
	 */
	public static void main(String[] args) {
		
		
		int i;
		
//		 Each term increases with 5 so considering to it be a AP of difference 5 and first term 3
		
		int d = 5;
	    i = ((78-3)/d)+1;
	    System.out.println("The value of i for 78 is " + i);

	}

}

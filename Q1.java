package soaCodingCLub;

import java.util.Scanner;

public class Q1 {
//	An array of n distinct element is provided find the minimum number of swaps required to sort it	
	
	public static void main(String[] args) {
	
		int[] arr = {2, 6, 1, 67, 4, 5, 8, 10};
		
		int num = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			
			int minInd = i;
			
			for(int j = i; j < arr.length; j++ ) {
				 if(arr[j] < arr[minInd]) {
					 minInd = j;
				 }
			} int temp = arr[i];
			arr[i]= arr[minInd];
			arr[minInd] = temp;
			num++;
			
		}
		System.out.println("The sorted array is: ");
		for(int e: arr) {
			System.out.print(e + " ");
		}
		System.out.println();
		System.out.println("The minimum number of sorts for the array is: " + num);

	}

}
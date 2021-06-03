package soaCodingCLub;

public class Q5 {
/*Given an array of integers.Your task is to find and display the inversion count in an array also display 
the pairs that satisfies the inversions.If no inversions found print 0.*/

		public static void main(String[] args) {
			int arr[] = new int[] { 2, 26, 19, 8, 11 };
			int count=0;             
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j] ) {
						count++;
					}
				}
			}
			if (count == 0) {
				System.out.println("The inversion count of the array is 0 ");
			} else {
				System.out.println("The inversion count of the array is: "+ count);

		}

	}
}
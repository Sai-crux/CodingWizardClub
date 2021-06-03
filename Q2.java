package soaCodingCLub;
import java.util.Scanner;
public class Q2 {
	/*Sorting of 2D array in both the manner i.e. in ascending and descending order, by the means of 
	switch case operation an option which order sort should be provided to user.
	Instructions to follow 
	1. All the elements of array should be entered by user no pre-filled values are acceptable.
	2. Use of Inbuilt functions are restricted.*/
    static int ascending(int a[][])
    {      
        for (int i = 0; i < a.length; i++) {
            
            for (int j = 0; j < a[i].length; j++) {
                
                for (int k = 0; k < a[i].length - j - 1; k++) {
                    if (a[i][k] > a[i][k + 1]) {                        
                        int t = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = t;
                    }
                }
            }
        }        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        } 
        return 0;
    }
    static int descending(int b[][])
    {        
        for (int i = 0; i < b.length; i++) {
            
            for (int j = 0; j < b[i].length; j++) {
                
                for (int k = 0; k < b[i].length - j - 1; k++) {
                    if (b[i][k] < b[i][k + 1]) {                         
                        int t = b[i][k];
                        b[i][k] = b[i][k + 1];
                        b[i][k + 1] = t;
                    }
                }
            }
        }
        
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        } 
        return 0;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = in.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = in.nextInt();
		int[][] array = new int[rows][cols];
		
		System.out.println("Enter the elements of the array: ");
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0 ; j <cols ; j++) {
				array[i][j] = in.nextInt();
			}
		}
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0 ; j <cols ; j++) {
				System.out.print(array[i][j]+ " ");
		
		}System.out.println();
		
	}
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter whether you want to arrange in ascending(a) or descending(d) order : ");
		String s= sc.next();
		   switch(s) {
		   case "a" :
			   ascending(array);
			   break;
		   case "d" :
			   descending(array);
			   break;
		
		   }
	}
}

		
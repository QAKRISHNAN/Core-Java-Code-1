package Arrays;

import java.util.Scanner;

public class Multiplication_of_Given_Two_Arrays {

	public static void main(String[] args) 
	{
		int n;
	    //object of scanner class
	    Scanner scan = new Scanner(System.in);

	    //input base (number of rows and columns)
	    System.out.print("Enter the size of  array : ");
	    n = scan.nextInt();

	    //create two_D array (matrix) objects
	    int[][] a = new int[n][n];
	    int[][] b = new int[n][n];
	    int[][] c = new int[n][n];

	    //input matrix 1
	    System.out.println("Enter the elements of 1st Matrix row wise \n");
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        a[i][j] = scan.nextInt();
	      }
	    }

	    //input matrix 2
	    System.out.println("Enter the elements of 2nd mrtix row wise \n");
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        b[i][j] = scan.nextInt();
	      }
	    }
	  //Print First array elements
	    System.out.println("First array elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
	//Print Second array elements
		
		System.out.println("Second array elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			System.out.print(b[i][j]+"   ");
			}
			System.out.println();
		}

	    //multiplication logic
	    
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        for (int k = 0; k < n; k++) {
	          c[i][j] = c[i][j] + a[i][k] * b[k][j];
	          //c[i][j]+=a[i][k]*b[k][j]; 
	        }
	      }
	    }

	    //print final/result matrix 
	    System.out.println("Multification of the given arrays are : ");
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        System.out.print(c[i][j] + " ");
	      }
	      System.out.println();
	    }


	}

}

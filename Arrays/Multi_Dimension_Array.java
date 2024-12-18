package Arrays;

import java.util.Scanner;

public class Multi_Dimension_Array {

	public static void main(String[] args) {

		// Static Method

		/*
		 * int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		 * System.out.println("First Array is");
		 * 
		 * for(int i=0;i<3;i++) //Row { for(int j=0;j<3;j++) //Column {
		 * System.out.print(a[i][j]+"   ");
		 * 
		 * } System.out.println(""); }
		 * 
		 * int b[][]= {{90,80,70},{60,50,40},{30,20,10}};
		 * System.out.println("Second Array is");
		 * 
		 * for(int i=0;i<3;i++) //Row { for(int j=0;j<3;j++) //Column {
		 * System.out.print(b[i][j]+"   ");
		 * 
		 * } System.out.println(""); }
		 */

		// Dynamic Method

		// Dynamic Method

		Scanner scan = new Scanner(System.in);

		/*	System.out.println("Enter First Array Row Size");
		int frsize = scan.nextInt();

		System.out.println("Enter First Array Column Size");
		int fcsize = scan.nextInt();

		// Memory Allocation

		int a[][] = new int[frsize][fcsize];
		
		System.out.println("Enter First Array Elements");
		
		for(int i=0;i<frsize;i++)
		{
			for(int j=0;j<fcsize;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		//Second Array
		System.out.println("Enter Second Array Row Size");
		int srsize = scan.nextInt();

		System.out.println("Enter Second Array Column Size");
		int scsize = scan.nextInt();

		// Memory Allocation

		int b[][] = new int[srsize][scsize];
		
		System.out.println("Enter Second Array Elements");
		
		for(int i=0;i<srsize;i++)
		{
			for(int j=0;j<scsize;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		 System.out.println("First Array is");
		 
		 for(int i=0;i<frsize;i++) //Row 
			 { 
		for(int j=0;j<fcsize;j++) //Column 
			{
		 System.out.print(a[i][j]+"   ");
		 
		 } 
		System.out.println(""); 
		 }
		
		 
		 System.out.println("Second Array is");
		 
		 for(int i=0;i<srsize;i++) //Row 
			 { 
		for(int j=0;j<scsize;j++) //Column 
			{
		 System.out.print(b[i][j]+"   ");
		 
		 } 
		System.out.println(""); 
		 }	
		
		*/
		
		System.out.println("Enter Array Size");
		int size = scan.nextInt();
		
		int a[][] = new int[size][size];
		
		System.out.println("Enter First Array Elements");
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		int b[][] = new int[size][size];
		
		System.out.println("Enter Second Array Elements");
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("First Array is");
		 
		 for(int i=0;i<size;i++) //Row 
			 { 
		for(int j=0;j<size;j++) //Column 
			{
		 System.out.print(a[i][j]+"   ");
		 
		 } 
		System.out.println(""); 
		 }
				 
		 System.out.println("Second Array is");
		 
		 for(int i=0;i<size;i++) //Row 
			 { 
		for(int j=0;j<size;j++) //Column 
			{
		 System.out.print(b[i][j]+"   ");
		 
		 } 
		System.out.println(""); 
		 }
	}

}

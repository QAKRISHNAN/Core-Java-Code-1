package Arrays;

import java.util.Scanner;

public class Double_Dimension_Array {

	public static void main(String[] args) {
		
		//Static Method
		
	/*	int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println("Given Array is");
		
		for(int i=0;i<3;i++)  //Row 
		{
			for(int j=0;j<3;j++)  //Column 
			{
			System.out.print(a[i][j]+"   ");
			
		}
			System.out.println("");
		}
*/
		//Dynamic Method
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Array Row Size");
		int rsize=scan.nextInt();
			
		System.out.println("Enter Array Column Size");
		int csize=scan.nextInt();
		
		//Memory Allocation
		
		int a[][]=new int[rsize][csize];
		
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Given Array is");
		
		for(int i=0;i<rsize;i++)  //Row 
		{
			for(int j=0;j<csize;j++)  //Column 
			{
			System.out.print(a[i][j]+"   ");
			
		}
			System.out.println("");
		}


	}

}

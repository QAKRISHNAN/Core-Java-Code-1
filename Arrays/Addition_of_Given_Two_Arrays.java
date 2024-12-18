package Arrays;

import java.util.Scanner;

public class Addition_of_Given_Two_Arrays {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Array Row Size");
		int rsize=scan.nextInt();
			
		System.out.println("Enter Array Column Size");
		int csize=scan.nextInt();
		
		//First Array
		int a[][]=new int[rsize][csize];
		
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		//Second Array
		int b[][]=new int[rsize][csize];
		
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
	//Perform Addition
		
		int c[][]=new int[rsize][csize];
	
		//Print OutPut
		
		System.out.println("Addition of Given Two Array are: ");
		
		for(int i=0;i<rsize;i++)  //Row 
		{
			for(int j=0;j<csize;j++)  //Column 
			{
				c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+"   ");
			
		}
			System.out.println("");
		}
		
	}

}

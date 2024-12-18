package Arrays;

import java.util.Scanner;

public class MultiDimension_Array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		// Static
		/*
		System.out.println("1st Array");
		int a[][]= {{10,20},{30,40}}; //2*2
		
		for(int i=0;i<2;i++) //Rows 0<2 1<2T 2<2 F  
		{
			for(int j=0;j<2;j++) //0<2 1<2T 2<2 F 
			{
				System.out.print(a[i][j]+"   "); //a[0][0] a[0][1] 
												 //a[1][0] a[1][1]
			}
			System.out.println();
		}
		
		System.out.println("2nd Array"); 
		int b[][]= {{50,60},{70,80},{90,100}}; //3*2
		
		for(int i=0;i<3;i++) //Rows 0<2 1<2T 2<2 F  
		{
			for(int j=0;j<2;j++) //0<2 1<2T 2<2 F 
			{
				System.out.print(b[i][j]+"   "); //a[0][0] a[0][1] 
												 //a[1][0] a[1][1]
			}
			System.out.println();
		}
		*/
		//Dynamic
		//Memory Allocation
		
	int a[][]=new int[2][2];
	int b[][]=new int[3][3];
	
	System.out.println("Enter First Array Elements: ");
	
	for(int i=0;i<2;i++) //Rows 0<2 1<2T 2<2 F  
	{
		for(int j=0;j<2;j++) //0<2 1<2T 2<2 F 
		{
			a[i][j]=scan.nextInt();
			
		}
	}
	
	
	System.out.println("Enter Second Array Elements: ");
	
	for(int i=0;i<3;i++) //Rows 0<2 1<2T 2<2 F  
	{
		for(int j=0;j<3;j++) //0<2 1<2T 2<2 F 
		{
			b[i][j]=scan.nextInt();
			
		}
	}
	
	System.out.println("1st Array");
		
	for(int i=0;i<2;i++) //Rows 0<2 1<2T 2<2 F  
	{
		for(int j=0;j<2;j++) //0<2 1<2T 2<2 F 
		{
			System.out.print(a[i][j]+"   "); //a[0][0] a[0][1] 
											 //a[1][0] a[1][1]
		}
		System.out.println();
	}
	
	System.out.println("2nd Array"); 
		
	for(int i=0;i<3;i++) //Rows 0<2 1<2T 2<2 F  
	{
		for(int j=0;j<3;j++) //0<2 1<2T 2<2 F 
		{
			System.out.print(b[i][j]+"   "); //a[0][0] a[0][1] 
											 //a[1][0] a[1][1]
		}
		System.out.println();
	}
	

	}

}

package Arrays;

import java.util.Scanner;

public class Single_Dimension_Array {

	public static void main(String[] args) {
		//Static Input Method
	/*	int a[]= {10,20,30,40,50};
		
		for(int i=0;i<5;i++)
		{
			//System.out.println(a[i]);
			System.out.print(a[i]+"  ");
		}  */
		
		//Dynamic MEthod
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size=scan.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<size;i++)
		{
			a[i]=scan.nextInt();  //10 20 30 40 50 
		}
		
		System.out.println("Given Array is");
		
		for(int i=0;i<size;i++)
		{
			//System.out.println(a[i]);
			System.out.print(a[i]+"  ");
		}

	}

}

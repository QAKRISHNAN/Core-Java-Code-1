package Arrays;

import java.util.Scanner;

public class Sample_Array {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//To Declare and Print Array
		/*
		int htno[]={01,02,03,04,05}; //Static 
		
		for(int i=0;i<5;i++) //0<5 1<5 T 5<=5F  
		{
		
		System.out.println(htno[i]); //htno[0] htno[1] htno[5]
		
		}
		*/
		
		//Dynamic Array
		//Memory Allocation
		//datatype arrayname=new datatype(size);
		
		int a[]=new int[5];
		
		System.out.println("Enter Array Elements: ");
		
		for(int i=0;i<5;i++) //0<5 1<5 T 5<=5F  
		{		
				a[i]=scan.nextInt();
		}
		
		System.out.println("Given Array is: ");
		for(int i=0;i<5;i++) //0<5 1<5 T 5<=5F  
		{
		
		System.out.println(a[i]); //htno[0] htno[1] htno[5]
		
		}
		
		//ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
		
		
		
		
		/*
		//60Members:
		int  htno1=01;
		int htno2=02;
		int htno3=03;
		
		//System.out.println(htno1+htno2+htno3);
		
		System.out.println(htno1);
		System.out.println(htno2);
		System.out.println(htno3);
		*/
		
		//int htno[]={01,02,03,60,55}; 
		
		//float percentage[]= {10.5f,50f};
		
		//boolean result[]= {true,false};
	}

}

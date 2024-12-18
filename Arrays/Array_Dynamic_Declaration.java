package Arrays;

import java.util.Scanner;

public class Array_Dynamic_Declaration 
{

	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		
		//Size DEclaration 
		//datatype arraname[]=new datatype[size];
		
		int a[]=new int[5];
		
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<5;i++)
		{
			a[i]=scan.nextInt();  //10 20 30 40 50 
		}
		
		System.out.println("Given Array is");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}

}

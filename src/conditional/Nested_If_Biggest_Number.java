package conditional;

import java.util.Scanner;

public class Nested_If_Biggest_Number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
	System.out.println("Enter any 3 Values: ");
	int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
	
	if(a>b) //7>6 
	{
	if(a>c)
	{
		System.out.println("a is big: "+a);//TBS 
	}
	}
	
	else if(b>c)
	{
		System.out.println("b is big: "+b);//TBS 
	}
	
	else
	{
		System.out.println("c is big: "+c);//TBS 
	}
	
	
	
	/*
			//int a=7, b=6, c=5;
			//int a=5, b=7, c=6;
			int a=5, b=6, c=7;
		if(a>b) //7>6 
		{
		if(a>c)
		{
			System.out.println("a is big: "+a);//TBS 
		}
		}
		
		else if(b>c)
		{
			System.out.println("b is big: "+b);//TBS 
		}
		
		else
		{
			System.out.println("c is big: "+c);//TBS 
		}
		*/
		
		
		
		

	}

}

package CoditionalStatements;

import java.util.Scanner;

public class Find_Biggest_Number {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any 3 Numbers: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		//30 20 10  20 30 10  10 20 30
		
		if(num1>=num2)
		{
			if(num1>=num3)
			{
				//System.out.println("Num1 is Big: "+ num1);
				System.out.println(num1+ " is Big ");
			}
		}
	
		else if(num2>=num3)
		{
			//System.out.println("Num2 is Big: "+ num2);
			System.out.println(num2+ " is Big ");
		}
		else
		{
			//System.out.println("Num3 is Big: "+ num3);
			System.out.println(num3+ " is Big ");
		}

	}

}

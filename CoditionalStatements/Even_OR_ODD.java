package CoditionalStatements;

import java.util.Scanner;

public class Even_OR_ODD 
{

	public static void main(String[] args) 
	{
			//2  15  % 0 1 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=scan.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given Number is Odd");
		}


	}

}

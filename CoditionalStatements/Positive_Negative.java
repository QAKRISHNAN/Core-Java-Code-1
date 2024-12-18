package CoditionalStatements;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		
		//5 -5 >0 + 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=scan.nextInt();
		
		if(num>=0)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("Negative Number");
		}

	}

}

package CoditionalStatements;

import java.util.Scanner;

public class Eligible_To_Cast_Vote {

	public static void main(String[] args) {
		/* Enter your Age 30
		 * if(age>=18) Eligible or Not-Eligible  
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=scan.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible To Apply For Vote");
		}
		else
		{
			System.out.println("You are Not Eligible To Apply For Vote");
			System.out.println("Try After Few Days");
		}

	}

}

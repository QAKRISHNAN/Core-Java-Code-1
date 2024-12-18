package conditional;

import java.util.Scanner;

public class Test 
{

public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter any 2 Values Here: ");
		
		int a=scan.nextInt(),b=scan.nextInt();
		
		int c=a/b;
		System.out.println(c);
		
		scan.close();
}

}

package conditional;

import java.util.Scanner;

public class Switch_Calculator {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter any 3 Values Here: ");
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
		//int a=1,b=2,c=3;
		
		System.out.println("CALCULATOR");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBSTRACTION");
		System.out.println("3.MULTIFICATION");
		System.out.println("4.DIVISION");
		System.out.println("5.MODULO DIVISION");
		
		System.out.println("Enter your Choice: ");
		byte ch=scan.nextByte();
		//byte ch=2;
		
		switch(ch)
		{
		case 1:
		{
			int sum=a+b+c;
			System.out.println("Addition: "+sum);
			break;
			//continue;
		}
		case 2:
		{
			int sub=a-b-c;
			System.out.println("Substraction: "+sub);
			break;
		}
		case 3:
		{
			int mul=a*b*c;
			System.out.println("Multification : "+mul);
			break;
		}
		case 4:
		{
			int div=a/b/c;
			System.out.println("Division: "+div);
			break;
		}
		case 5:
		{
			int mdiv=a%b%c;
			System.out.println("Modulo Division: "+mdiv);
			break;
		}
		default: 
		{
			System.out.println("Pls Enter Between 1 to 5 Only");
		}
		
		}
		
		
		
		
		
		
		
		scan.close();
	}

}

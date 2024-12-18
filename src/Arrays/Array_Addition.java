package Arrays;

import java.util.Scanner;

public class Array_Addition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//c=a+b 	c[][]=a[][]+b[][]
		
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		
		System.out.println("Enter First Array Elements: ");
		
		for(int i=0;i<2;i++) //Rows 0<2 1<2T 2<2 F  
		{
			for(int j=0;j<2;j++) //0<2 1<2T 2<2 F 
			{
				a[i][j]=scan.nextInt();
				
			}
		}
		
		System.out.println("Enter Second Array Elements: ");
		
		for(int i=0;i<2;i++) //Rows 0<2 1<2T 2<2 F  
		{
			for(int j=0;j<2;j++) //0<2 1<2T 2<2 F 
			{
				b[i][j]=scan.nextInt();
				
			}
		}
		
		//Addition 
		
		System.out.println("Addition of given Two Arrays are: ");
		
		for(int i=0;i<2;i++) //Rows 0<2 1<2T 2<2 F  
		{
			for(int j=0;j<2;j++) //0<2 1<2T 2<2 F 
			{
				//c[i][j]=a[i][j]+b[i][j];
				c[i][j]=a[i][j]-b[i][j];
				
				System.out.print(c[i][j]+"   "); 
				
			}
			System.out.println();
		}
	}

}

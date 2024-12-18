package MethodOverLoading;

public class Calculator 
{
	public void Addition(int a, int b) //Declaration
	
	{
		//Without ReturnType and Without Parameters
		
		
		int sum=a+b;
		System.out.println("Additon:" + sum);
	}
	public void Addition(int a, int b,int c) //Declaration 
	{
		//Without ReturnType and Without Parameters
		
		
		int sum=a+b+c;
		System.out.println("Additon:" + sum);
	}
	public void Addition(int a, int b,int c,int d) //Declaration 
	{
		//Without ReturnType and Without Parameters
		
		
		int sum=a+b+c+d;
		System.out.println("Additon:" + sum);
	}

	public static void main(String[] args) 
	{
		Calculator cal=new Calculator();
		cal.Addition(10, 20);
		cal.Addition(10, 20, 30);
		cal.Addition(10, 20, 30, 40);
	}
}

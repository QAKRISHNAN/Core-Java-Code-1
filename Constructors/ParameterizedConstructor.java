package Constructors;

public class ParameterizedConstructor
{ 
	public	ParameterizedConstructor(int a,int b) 
	//Parameterized Constructor
	{
		 int c=a+b;
		 System.out.println(c);
	}

	public static void main(String[] args)
	{
		ParameterizedConstructor obj=new ParameterizedConstructor(10,20);
		
	}
}

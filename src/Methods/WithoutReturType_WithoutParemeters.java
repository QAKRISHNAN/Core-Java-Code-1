package Methods;

public class WithoutReturType_WithoutParemeters 
{
	private static void Add() //Declaration 
	{
		//Without ReturnType and Without Parameters
		//The method Addition() from the type WithoutReturType_WithoutParemeters is never used locally
		
		int a=100,b=200;
		int c=a+b;
		System.out.println("Additon:" + c);
	}
	public static void main(String[] args) 
	{
		WithoutReturType_WithoutParemeters.Add();
	}
}

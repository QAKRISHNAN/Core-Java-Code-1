package Constructors;

public class Paremeterized 
{

	public Paremeterized (int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Paremeterized par=new Paremeterized(10,20);
		Paremeterized par1=new Paremeterized(100,200);
		
	}
	
}

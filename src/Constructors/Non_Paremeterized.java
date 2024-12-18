package Constructors;

public class Non_Paremeterized 
{
	private  Non_Paremeterized ()
	{
		int a=100,b=200;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		Non_Paremeterized nonp=new Non_Paremeterized();
		
	}
	
}

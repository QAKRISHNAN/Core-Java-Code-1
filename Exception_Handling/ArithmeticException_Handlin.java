package Exception_Handling;

public class ArithmeticException_Handlin {

	public static void main(String[] args) 
	{

		try
		{
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);	
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Cannot Divide by Zero"+ae);
			
		}
		
		System.out.println("Performed Division");
		System.out.println("Sucess");
		System.out.println("Thanku");

	}

}

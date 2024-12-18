package Exception_Handling1;

public class Sample_exceptions {

	public static void main(String[] args) {

		try
		{
		System.out.println(20/10);
		System.out.println(10/2);
		System.out.println(5/0);
		System.out.println("Success");
		System.out.println(100/50);
		System.out.println(200/10);
		}
		
		catch(ArithmeticException a)
		{
			System.out.println(a.getMessage());
			
		}
	}

}

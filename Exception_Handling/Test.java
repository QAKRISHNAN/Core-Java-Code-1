package Exception_Handling;

public class Test {

	public static void main(String[] args) 
	{
		

		try {
            System.out.println(8/3);
            System.out.println(8/3);
            }
		
		catch (ArithmeticException e) 
		{
            System.out.println("ArithmeticException => " + e);
        }
		

	}

}

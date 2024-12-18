package Exception_Handling1;

public class Test {

	public static void main(String[] args) {

		try {
	        System.out.println(20/10);
	        System.out.println(10/2);
	        System.out.println(5/0);
	       
	
	    } catch (Exception a) {
	    	System.out.println(a);
	        System.out.println(100/50);
	        System.out.println(200/100);
	        System.out.println("Success");
	    }
		finally
		{
			System.out.println("Happy");
		}
	}


}

package Methods;

public class WithReturType_WithParemeters 
{
	private static double Div(double a,double b) //Declaration 
	{
		
		//WithReturType_WithParemeters 
		
		double c=a/b;
		System.out.println("Division:" + c);
		return c;
		
	}
	public static void main(String[] args) 
	{
		WithReturType_WithParemeters.Div(5.0, 2.0);
		
	}

}

package Methods;

public class WithReturType_WithoutParemeters 
{
	private int Mul() //Declaration 
	{
		//With ReturType and Without Parameters
		
		int a=10,b=20;
		int c=a*b;
		
		//System.out.println("Multification:" + c);
		return c;
		
	}
	public static void main(String[] args) 
	{
		
		WithReturType_WithoutParemeters mul1=new WithReturType_WithoutParemeters();
		//mul1.Mul();
		System.out.println("Multification:"+(mul1.Mul() ));
	}
}

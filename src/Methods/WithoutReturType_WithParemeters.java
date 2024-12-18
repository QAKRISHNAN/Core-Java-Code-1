package Methods;

public class WithoutReturType_WithParemeters 
{
	private  void Sub(int a,float b) //Declaration 
	{
		//Without ReturnType and WithParemeters 
		
		float c=a-b;
		System.out.println("Substraction:" + c);
	}
	public static void main(String[] args) 
	{
		WithoutReturType_WithParemeters sub1=new WithoutReturType_WithParemeters();
		//Method Calling
		sub1.Sub(20, 10.5f);
		sub1.Sub(200, 100);
		sub1.Sub(2000, 1000);
	}

}

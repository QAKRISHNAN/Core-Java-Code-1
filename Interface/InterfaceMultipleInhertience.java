package Interface;

interface Parent1
{
public abstract void Father1();
}

interface Parent2
{
public void Father2();
}

public class InterfaceMultipleInhertience implements Parent1,Parent2 
{
	public void Father1()
	{
		System.out.println("I am your Father-1");
	}
	public void Father2()
	{
		System.out.println("I am your Father-2");
	}
}

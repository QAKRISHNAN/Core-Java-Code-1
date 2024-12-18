package Exception_Handling;

public class NullPointerExceptionHandlind {

	public static void main(String[] args) {

		try
		{
			
			//String name="Krishna";
			String name=null;
			System.out.println(name.length());
		}
		catch(NullPointerException npe)
		{
			System.out.println(npe);
		}
		System.out.println("Finding given String Length");
		System.out.println("Sucess");
		System.out.println("Thanku");

	}

}

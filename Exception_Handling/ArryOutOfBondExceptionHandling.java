package Exception_Handling;

public class ArryOutOfBondExceptionHandling {

	public static void main(String[] args) {
		
		try
		{
			int a[]= {1,2,3,4,5}; //ArrayIndexOutOfBoundsException
			for(int i=0;i<6;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException aib)
		{
			System.out.println("Loop must be Lesser or Equal to Size"+aib);
		}
		System.out.println("Performed Array Printing");
		System.out.println("Sucess");
		System.out.println("Thanku");

	}

}

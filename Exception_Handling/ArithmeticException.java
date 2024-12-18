package Exception_Handling;

public class ArithmeticException
{
	public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic Exception occurred: " + e);
        }
    }
}

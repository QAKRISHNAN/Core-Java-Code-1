package Methods;

public class WRWP 
{
	public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
	public static void main(String[] args) 
	{
		int total = add(10, 20);
		System.out.println("Sum: " + total);
	}
}

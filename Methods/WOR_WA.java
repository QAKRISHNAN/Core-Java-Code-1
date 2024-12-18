package Methods;

public class WOR_WA 
{
	// Method to perform addition without returning a value
    public static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    // Main method to test the addition method
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 7;
        add(number1, number2); // Calling the add method with arguments
    }
}

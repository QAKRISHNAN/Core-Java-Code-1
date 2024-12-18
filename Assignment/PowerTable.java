package Assignment;

import java.util.Scanner;

public class PowerTable {
	// Method to calculate and print the power table
    public static void powerTable(long base, long exponent) {
        System.out.println("Power table for base " + base + " and exponent " + exponent + ":");
        for (long i = 1; i <= exponent; i++) {
            long result = 1;
            for (long j = 1; j <= i; j++) {
                result *= base;
            }
            System.out.println(base + " ^ " + i +  " = " + result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the base and exponent
        System.out.print("Enter the base: ");
        long base = scanner.nextLong();
        System.out.print("Enter the exponent: ");
        long exponent = scanner.nextLong();
        
        // Call the powerTable method with user inputs
        powerTable(base, exponent);
        
        scanner.close();
    }
}

package Assignment;
import java.util.Random;
import java.util.Scanner;

public class Guessing_Game 
{
	public static void guessingGame() {
        Random rand = new Random();
        char target = (char) (rand.nextInt(26) + 'a'); // Generate a random letter between 'a' and 'z'
        Scanner scanner = new Scanner(System.in);
        int guesses = 0;

        System.out.println("Welcome to the Guessing Game! Try to guess a letter between 'a' and 'z'.");

        while (true) {
            System.out.print("Enter your guess: ");
            char guess = scanner.next().charAt(0);
            guesses++;

            if (guess == target) {
                System.out.println("Congratulations! You guessed the correct letter '" + target + "'.");
                break;
            } else if (Math.abs(guess - target) <= 2) {
                System.out.println("Warm");
            } else if (Math.abs(guess - target) == 1) {
                System.out.println("Hot");
            } else {
                System.out.println("Cold");
            }
        }

        System.out.println("You made " + guesses + " guesses.");
    }

    public static void main(String[] args) {
        guessingGame();
    }
	
}



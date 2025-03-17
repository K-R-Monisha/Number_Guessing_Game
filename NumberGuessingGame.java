import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                break;
            }
        }
    }
}

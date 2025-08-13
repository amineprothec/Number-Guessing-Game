import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1; // رقم بين 1 و 100
        int userGuess;
        int attempts = 0;
        final int maxAttempts = 10;

        System.out.println("=== Welcome to Number Guessing Game ===");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("📈 Too low! Try a higher number.");
            } else {
                System.out.println("📉 Too high! Try a lower number.");
            }

            if (attempts >= maxAttempts) {
                System.out.println("❌ Game Over! The number was: " + numberToGuess);
                break;
            }
        }

        scanner.close();
    }
}

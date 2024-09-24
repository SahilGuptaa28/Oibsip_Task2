import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final int minRange = 1;
    private static final int maxRange = 100;
    private static final int maxAttempts = 5;
    private static final int maxRounds = 3;

    public static void main(String args[]) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        int totalScore = 0;


        System.out.println(" welcome to the Number Guessing Game ");
        System.out.println("Total number of rounds : 3");
        System.out.println("Attempts in each round is : 5\n");
        for (int i = 1; i <= maxRounds; i++) {
            int number = random.nextInt(maxRange) + minRange;
            int attempts = 0;

            System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.", i, minRange, maxRange, maxAttempts);

            while (attempts < maxAttempts) {
                System.out.println("Enter your guess : ");
                int guessNumber = s.nextInt();
                attempts++;
                if (guessNumber == number) {
                    int score = maxAttempts - attempts;
                    totalScore = totalScore + score;
                    System.out.printf("wow! number guessed successfully. Attempts = %d. Round Score = %d\n", attempts, score);
                    break;
                } else if (guessNumber < number) {
                    System.out.printf("The number is greater than %d. Attempts left = %d\n.", guessNumber, maxAttempts - attempts);

                } else if (guessNumber > number) {
                    System.out.printf("number is less than %d. Attempts left = %d\n.", guessNumber, maxAttempts - attempts);
                }

                if (attempts == maxAttempts) {
                    System.out.println("Game Over");
                    System.out.printf("Round= %d\n", i);
                    System.out.println("Attempts = 0");
                    System.out.printf("The Ramdom number is : %d\n", number);

                }
                System.out.printf("Total Score = %d\n", totalScore);
                 
            }
        }

        }
    }
}
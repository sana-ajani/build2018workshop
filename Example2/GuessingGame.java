import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Random rand = new Random();
        int numToGuess = rand.nextInt(100);
        int numOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println("Guess a number between 1 and 100");

        while (!win) {
            guess = input.nextInt();
            numOfTries++;

            //Fill in the following conditonal logic:
            //if your guess is correct
            //if your guess is too low
            //if your guess is too high
            
        }

        System.out.println("Yay! You got it! :)");
        System.out.println("The number was " + numToGuess + ". It took you " + numOfTries + " tries.");
    }

}
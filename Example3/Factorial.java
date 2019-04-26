import java.util.Scanner;

//The factorial of a number is the product of all positive integers less than or equal that number
// For example:
// Factorial of 5 = 5 * 4 * 3 * 2 * 1 = 120

public class Factorial {
    
    public static int factorial(int n) {
        //Write the base case
        //Fill in the recursive logic

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
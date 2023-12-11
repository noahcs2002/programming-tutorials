/**
 * Implement a program that takes the number of pennies, nickels, dimes, quarters, and dollars in a piggy bank
 * and finds the total. Then, print that out to the user. 
 */

import java.util.Scanner;

public class PiggyBankCounter {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of pennies: ");
        int numberOfPennies = scanner.nextInt();

        System.out.println("Enter number of nickels: ");
        int numberOfNickels = scanner.nextInt();

        System.out.println("Enter number of dimes: ");
        int numberOfDimes = scanner.nextInt();

        System.out.println("Enter number of quarters: ");
        int numberOfQuarters = scanner.nextInt();

        System.out.println("Enter number of dollars: ");
        int numberOfDollars = scanner.nextInt();

        double total = numberOfDollars;

        total += (numberOfQuarters * .25);
        total += (numberOfDimes * .10);
        total += (numberOfNickels * .05);
        total += (numberOfPennies * .01);

        System.out.printf("Total: %f", total);
        scanner.close();
    }
}
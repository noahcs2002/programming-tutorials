import java.util.Scanner;

/**
 * Write a program that takes the users input for their name, and prints "Nice to meet you, " and their name.
 * For instance, if I enter my name as Noah, it would print "Nice to meet you, Noah". Do so using Print Format (.printf)
 */

public class IoBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.printf("Nice to meet you, %s", name);
        scanner.close();
    }    
}

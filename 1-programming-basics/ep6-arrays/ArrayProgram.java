import java.util.Scanner;

/**
 * Implement a program that takes in user input to format an array.
 * 
 * The first number the user enters will be the size of the array. If the user enters 10, it will be a 10 element array.
 * The next n numbers will be the elements of the array.
 * 
 * For example:
 * 5
 * 1
 * 3
 * 5
 * 7
 * 9
 * 
 * Would create
 * [1,3,5,7,9]
 * As an array.
 * 
 * Then reverse the array. In this case, the previous example would become
 * [9,7,5,3,1].
 * 
 * Then, loop through the array and print the standard representation of the array
 * (i.e : [9,7,5,3,1]).
 */

public class ArrayProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter in the number of elements in the array: ");
        int elementCount = scanner.nextInt();

        int[] numbers = new int[elementCount];

        for(int i = 0; i < elementCount; i += 1) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        int[] reversed = new int[elementCount];

        for (int i = 0; i < numbers.length; i += 1) {
            reversed[i] = numbers[elementCount - i - 1];
        }

        System.out.print("[");
        for (int i = 0; i < numbers.length; i += 1) {
            System.out.print(reversed[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
    
}

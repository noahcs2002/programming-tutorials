/**
 * Write a program that defines the following 5 methods:
 * 
 * sumInt:
 *  Take two integers and return their sum
 * sumDouble: 
 *  Take two doubles and return their sum
 * reverseString:
 *  Take a String and reverse it
 * square:
 *  Take an integer and return the square of it.
 * printSpongebobCase:
 *  Take a string and print it in spongebob case ("Hello world!" -> "HeLlO wOrLd!")
 * 
 * Make all methods static, and call them with sample inputs in the main method.
 */

public class Methods {

    // Method 1: sumInt
    public static int sumInt(int a, int b) {
        return a + b;
    }    

    // Method 2: sumDouble 
    public static double sumDouble(double a, double b) {
        return a + b;
    }

    // Method 3: reverseString
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = 0; i < str.length(); i += 1) {
            reversed += str.charAt(str.length() - i - 1);
        }

        return reversed;
    }

    // Method 4: Square int.
    // Note: used a long to allow for potentially large numbers to work.
    public static long squareInt(int a) {
        return a * a;
    }

    // Method 5: Spongebob Case
    public static void printSpongebobCase(String str) {
        for(int i = 0; i < str.length(); i += 1) {
            if(i % 2 == 0) {
                System.out.print((""+str.charAt(i)).toUpperCase());
            }
            else {
                System.out.print((""+str.charAt(i)).toLowerCase());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(sumInt(4, 21));
        System.out.println(sumDouble(0.12, 1.932));
        System.out.println(reverseString("Hello world!"));
        System.out.println(squareInt(5));
        printSpongebobCase("Hello world!");        
    }

}

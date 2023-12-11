import java.util.Random;
import java.util.Scanner;

/**
 * Create a basic rock paper scissors game. Allow the user to enter 'r' for rock, 
 * 'p' for paper, and 's' for scissors. After the game is decided, display the winner, 
 * and prompt the user to keep playing, and allow them to enter 'y' for yes and 'n' for no.
 * 
 * Have the 'computer' pick randomly.
 */

public class RockPaperScissors {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String currentInput = "";
        String cpuChoice = "";

        do {
            System.out.println("(R)ock, (P)aper, or (S)cissors?");
            currentInput = scanner.nextLine();
            // generates 0, 1, or 2
            int cpuTurn = random.nextInt(3);

            switch(cpuTurn) {
                case 0 -> {
                    cpuChoice = "r";
                }

                case 1 -> {
                    cpuChoice = "p";
                }

                case 2 -> {
                    cpuChoice = "s";
                }

                // No default since we have covered all possible cases.
            }

            // normalise to get rid of potential case issues.
            currentInput = currentInput.toLowerCase();

            switch(currentInput) {
                case "r" -> {
                    if (cpuChoice.equals("r")) {
                        System.out.println("CPU Chose Rock: It's a Tie");
                    }
                    else if (cpuChoice.equals("p")) {
                        System.out.println("CPU Chose Paper: You Lose");
                    }
                    else {
                        System.out.println("CPU Chose Scissors: You Win");
                    }
                }
                case "p" -> {
                    if (cpuChoice.equals("p")) {
                        System.out.println("CPU Chose Paper: Tie");
                    }
                    else if (cpuChoice.equals("s")) {
                        System.out.println("CPU chose Scissors: Lose");
                    }
                    else {
                        System.out.println("CPU chose Rock: Win");
                    }
                }
                case "s" -> {
                    if (cpuChoice.equals("s")) {
                        System.out.println("CPU Chose Scissors: Tie");
                    }
                    else if (cpuChoice.equals("r")) {
                        System.out.println("CPU Chose Rock: Lose");
                    }
                    else {
                        System.out.println("CPU Chose Paper: Win");
                    }
                }
                default -> {
                    System.out.println("Invalid input, please try again.");
                }
            } 

            System.out.println("Play again? (Y)es or (N)o?");
            currentInput = scanner.nextLine();

        }
        while(currentInput.equalsIgnoreCase("y"));

        scanner.close();
    }
}
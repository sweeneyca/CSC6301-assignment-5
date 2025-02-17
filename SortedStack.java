import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * This program reads a list of integer numbers from standard input,
 * stores them in a Stack, sorts them in ascending order, and
 * prints the sorted stack.
 *
 * <p>This program makes use of Java's Collections Framework to avoid
 * reinventing commonly used data structures and algorithms:
 * <ul>
 *     <li>{@code Stack<Integer>} for dynamic storage instead of a LinkedList</li>
 *     <li>{@code Collections.sort()} for efficient sorting</li>
 *     <li>{@code Scanner} for input handling</li>
 * </ul>
 *
 * <p>Usage:
 * The program can be run from the command line by compiling it first:
 * <pre>
 * javac SortedStack.java
 * java SortedStack
 * </pre>
 *
 * <p>To generate JavaDocs, use the command:
 * <pre>
 * javadoc -d doc SortedStack.java
 * </pre>
 *
 * @author Cara Sweeney
 * @version 1.1
 */
public class SortedStack {
    
    /**
    * Default constructor for SortedStack.
    * Initializes an empty stack to store integers.
    */
    public SortedStack() {
        // Default constructor
    }

    /**
     * Reads integers from the console, stores them in a Stack,
     * sorts them in ascending order, and prints them.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();

        System.out.println("Enter integers (enter 'done' to exit program):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.push(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or type 'done' to exit.");
                }
            }
        }
        scanner.close();

        // Sorting the stack
        Collections.sort(numbers);
        
        // Printing the sorted stack
        System.out.println("Sorted numbers: " + numbers);
    }
}

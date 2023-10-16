import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from stdin
        int integerInput = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left in the input buffer

        // Read a double from stdin
        double doubleInput = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character left in the input buffer

        // Read a string from stdin
        String stringInput = scanner.nextLine();

        // Close the Scanner object
        scanner.close();

        // Print the values with the specified format
        System.out.println("String: " + stringInput);
        System.out.println("Double: " + doubleInput);
        System.out.println("Int: " + integerInput);
    }
}

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read the first integer from stdin
        int num1 = scanner.nextInt();

        // Read the second integer from stdin
        int num2 = scanner.nextInt();

        // Read the third integer from stdin
        int num3 = scanner.nextInt();

        // Close the Scanner object
        scanner.close();

        // Print the integers on separate lines
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PDFHighlighter {

    public static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;
        for (char letter : word.toCharArray()) {
            int index = letter - 'a'; // Convert letter to corresponding index in h array
            maxHeight = Math.max(maxHeight, h[index]); // Find tallest letter
        }
        int width = word.length(); // Width of rectangle (number of letters in the word)
        return width * maxHeight; // Calculate area of rectangle
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] heights = new int[26];
        for (int i = 0; i < 26; i++) {
            heights[i] = scanner.nextInt();
        }
        
        String word = scanner.next();
        
        System.out.println(designerPdfViewer(heights, word)); // Output the result

        scanner.close();
    }
}

import java.util.Scanner;

public class HurdleRace {

    public static int hurdleRace(int k, int[] height) {
        int maxHurdle = findMax(height);
        int dosesNeeded = Math.max(0, maxHurdle - k); // Difference between max hurdle and natural jump height
        return (int) Math.ceil((double) dosesNeeded); // Round up to ensure all hurdles can be cleared
    }

    // Function to find maximum element in an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of hurdles
        int k = scanner.nextInt(); // Maximum height character can jump naturally
        int[] hurdles = new int[n]; // Array to store heights of hurdles

        // Input hurdle heights
        for (int i = 0; i < n; i++) {
            hurdles[i] = scanner.nextInt();
        }

        // Call hurdleRace function and print result
        System.out.println(hurdleRace(k, hurdles));
        
        scanner.close();
    }
}

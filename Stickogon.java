import java.util.Scanner;
import java.util.Arrays;

public class Stickogon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of sticks for the test case
            int[] sticks = new int[n];
            for (int i = 0; i < n; i++) {
                sticks[i] = scanner.nextInt(); // Length of each stick
            }
            
            // Sort the array to make sure we can group the largest equal sticks together
            Arrays.sort(sticks);
            
            int count = 0;
            for (int i = n - 1; i >= 2; i--) {
                // If we have at least three sticks of the same length, we can form a polygon
                if (sticks[i] == sticks[i - 2]) {
                    count++; // Increment the count of polygons
                    i -= 2; // Move the index to check for the next potential polygon
                }
            }
            
            System.out.println(count); // Output the result
        }

        scanner.close();
    }
}
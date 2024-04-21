import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        String s = scanner.next();

        // Count the occurrences of each digit
        int[] counts = new int[3];
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                counts[c - '1']++;
            }
        }

        // Generate the new sum
        StringBuilder newSum = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < counts[i]; j++) {
                newSum.append(i + 1).append("+");
            }
        }
        newSum.deleteCharAt(newSum.length() - 1); // Remove the last "+"

        // Print the new sum
        System.out.println(newSum);
    }
}

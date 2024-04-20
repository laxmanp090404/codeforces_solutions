import java.util.Scanner;

public class Petyaandstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int result = a.compareToIgnoreCase(b);

        if (result > 0) {
            System.out.println(1);
        } else if (result == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
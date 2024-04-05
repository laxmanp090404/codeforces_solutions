import java.util.Scanner;

public class Bitpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        sc.nextLine(); // Consume newline after reading the integer

        for (int i = 0; i < n; i++) {
            String op = sc.nextLine().toLowerCase(); // Convert to lowercase for easier comparison
            switch (op) {
                case "++x":
                case "x++":
                    x++;
                    break;
                case "--x":
                case "x--":
                    x--;
                    break;
                default:
                    break;
            }
        }
        System.out.println(x);
        sc.close();
    }
}

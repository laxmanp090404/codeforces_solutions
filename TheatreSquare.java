import java.util.*;

public class TheatreSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        int rows = (int) Math.ceil((double) m / a);
        int cols = (int) Math.ceil((double) n / a);
        System.out.println((long) rows * cols); 
        sc.close();

    }
}

import java.util.Scanner;

public class BeautifulMatrix {
   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][5];
        int moves = 0;
        int mrow = 0, mcol = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 1) {
                    mrow = i;
                    mcol = j;
                }
            }
        }

        moves += Math.abs(mrow - 2) + Math.abs(mcol - 2);

        System.out.println(moves);
        sc.close();
    }
}

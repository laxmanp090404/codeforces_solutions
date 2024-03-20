import java.util.*;

public class WayTooLongWords {
    public static void abbreviate(String word) {
      System.out.println((word.charAt(0))+Integer.toString(word.length()-2)+word.charAt(word.length()-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            String word = sc.next();
            if (word.length() > 10) {
                   abbreviate(word);
            }
            else{
                System.out.println(word);
            }
           n--;
        }
        sc.close();
    }
}

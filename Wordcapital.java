import java.util.*;
public class Wordcapital {
 public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    String word = sc.next();
    System.out.println(word.toUpperCase().substring(0,1)+word.substring(1));
    sc.close();
 }
}

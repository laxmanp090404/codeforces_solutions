import java.util.Scanner;
import java.util.TreeSet;

public class Boyorgirl{
    public static void findGender(String s){
        int n = s.length();
        TreeSet<Character> set =  new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
        }
        if(set.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        findGender(s);
        
    }
}
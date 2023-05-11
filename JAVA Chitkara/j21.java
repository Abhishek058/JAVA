import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class j21 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();

        for (int i = 0; i < a.length(); i++) {
            set1.add(a.charAt(i));
        }
        for (int i = 0; i < b.length(); i++) {
            set2.add(b.charAt(i));
        }

        Set<Character> newSet = new HashSet<Character>(set2);
        newSet.removeAll(set1);

        for (char ch : newSet) {
            System.out.print(ch);
        }
        sc.close();
    }
}
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class j25 {
    public static void CommonSubString() {
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
        Set<Character> common = new HashSet<Character>(set1);
        common.retainAll(set2);

        if (common.isEmpty()) {
            System.out.println("Nothing is Common.");
        } else {
            for (char ch : common) {
                System.out.print(ch);
            }
        }
        sc.close();
    }

    public static void NumberOfSubString(String str, String ch) {
        int cnt = 0;
        int chlen = ch.length();

        for (int i = 0; i <= str.length() - chlen; i++) {
            String stCheck = str.substring(i, chlen + i);
            if (stCheck.equals(ch)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        // CommonSubString();
        NumberOfSubString("sujaldndsujalskdsujalkdsujal", "sujal");
        // String st = "abcabdab";
        // System.out.println(st.length());
    }
}

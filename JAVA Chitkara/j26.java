import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class j26 {
    public static void classQuestion() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        sb.delete(str.length() - 1, str.length());
        sb.insert(3, 'a');
        String res = sb.toString();

        System.out.println(res);
    }

    public static String longeStringprefix(String[] strs) {
        int n = strs.length;
        String res = "";
        Arrays.sort(strs);
        for (int i = 0; i < n; i++) {
            System.out.print(strs[i] + " ");
        }
        String s1 = strs[0], s2 = strs[n - 1];
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return res;
            }
            res += s1.charAt(i);
        }
        return res;
    }

    public static void longestString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (char ch : set) {
            System.out.print(ch);
        }
    }

    public static void removeConsecutive() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                continue;
            } else {
                System.out.print(str.charAt(i));
            }
        }
        System.out.print(str.charAt(str.length() - 1));
    }

    public static void evenOddThread() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("Even Thread: " + (i + 1));
            } else {
                System.out.println("Odd Thread: " + (i - 1));
            }
        }
    }

    public static void main(String[] args) {
        // String[] strs = { "flower", "flow", "flight" };
        // String res = longeStringprefix(strs);
        // System.out.println(res);

        // longestString();

        // removeConsecutive();
        evenOddThread();
    }
}

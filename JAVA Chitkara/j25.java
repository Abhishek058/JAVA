import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;
import java.util.Arrays;

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

    public static void removeEven(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i += 2) {
            s = s + str.charAt(i);
        }
        System.out.println(s);
    }

    public static void FirstSubString(String str, String ch) {
        System.out.println(str.indexOf(ch));
    }

    public static void secondLargestElement(String str) {
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        Arrays.sort(arr);
        System.out.println(arr[str.length() - 2]);
    }

    public static void sumOfAllCharacter(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);
    }

    public static void frequencyOfEachElement(String str) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // CommonSubString();
        // NumberOfSubString("sujaldndsujalskdsujalkdsujal", "sujal");
        // removeEven("abhishek");
        FirstSubString("hello", "ll");
        // secondLargestElement("123456789");
        // sumOfAllCharacter("123456789");
        // frequencyOfEachElement("dndsujalskdsujalkdsujal");
    }
}

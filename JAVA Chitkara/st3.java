import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class st3 {
    public static void replaces_all_occurrences() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1) {
                res = res + 'x';
            } else {
                res += str.charAt(i);
            }
        }
        System.out.println(res);
    }

    public static void findCommon() {
        int[] array1 = { 5, 10, 15, 20, 25 };
        int[] array2 = { 25, 20, 15, 10, 5 };

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                }
            }
        }
    }

    public static void findFirst() {
        Scanner sc = new Scanner(System.in);
        String str = "Hello World! This is a test string.";
        String s = "is";

        System.out.println(str.indexOf(s));
    }

    public static void summArray() {
        int cnt = 0;
        int[] array1 = { 5, 10, 15, 20, 25 };

        for (int i = 0; i < array1.length; i++) {
            cnt += array1[i];
        }
        System.out.println(cnt);
    }

    public static void insertstring() {
        String res = "";
        String str = "Hello World!";
        String substring = "beautiful ";
        int position = 6;
        for (int i = 0; i < str.length(); i++) {
            if (i == position) {
                res += substring;
            }
            res += str.charAt(i);
        }
        System.out.println(res);
    }

    public static void frequncy() {
        int[] arr = { 1, 2, 3, 2, 1, 3, 4, 5, 4 };
        Map<Integer, Integer> f = new HashMap<>();
        for (int e : arr) {
            f.put(e, f.getOrDefault(e, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : f.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // replaces_all_occurrences();
        // findCommon();
        // findFirst();
        // summArray();
        // insertstring();\
        frequncy();
    }
}

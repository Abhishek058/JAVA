import java.util.Scanner;
import java.util.HashSet;

public class j15 {
    public static void fernheit() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int t = sc.nextInt();

        for (int i = s; i <= e; i += t) {
            int c = (i - 32) * 5 / 9;
            System.out.print(i + " -> " + c + "\n");
        }
    }

    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        printNum(n - 1);
        System.out.println(n);
    }

    public static int sumNum(int i, int n) {
        if (n == i) {
            return i;
        }
        return n + sumNum(i, n - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        return x * power(x, n - 1);
    }

    public static void towerOfHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("transfer disk: " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, dest, help);
        System.out.println("transfer disk: " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, help, dest, src);
    }

    public static void reverseString(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx - 1);

    }

    public static int first = -1;
    public static int last = -1;

    public static void firstLastOcc(String str, int idx, char ch) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currCh = str.charAt(idx);
        if (currCh == ch) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        firstLastOcc(str, idx + 1, ch);
    }

    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return isSorted(arr, idx + 1);
    }

    public static void moveAllX(String str, int idx, int cnt, String st) {
        if (idx == str.length()) {
            for (int i = 0; i < cnt; i++) {
                st += 'x';
            }
            System.out.println(st);
            return;
        }
        char currCh = str.charAt(idx);
        if (currCh == 'x') {
            cnt++;
            moveAllX(str, idx + 1, cnt, st);
        } else {
            st += currCh;
            moveAllX(str, idx + 1, cnt, st);
        }
    }

    public static boolean[] map = new boolean[26];

    public static void removeDup(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currCh = str.charAt(idx);
        if (map[currCh - 'a']) {
            removeDup(str, idx + 1, newStr);
        } else {
            newStr += currCh;
            map[currCh - 'a'] = true;
            removeDup(str, idx + 1, newStr);
        }
    }

    public static void subSeq(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currCh = str.charAt(idx);
        subSeq(str, idx + 1, newString + currCh);
        subSeq(str, idx + 1, newString);
    }

    public static void uniqSubSeq(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currCh = str.charAt(idx);
        uniqSubSeq(str, idx + 1, newString + currCh, set);
        uniqSubSeq(str, idx + 1, newString, set);
    }

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

    public static void keypadComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currCh = str.charAt(idx);
        String map = keypad[currCh - '0'];

        for (int i = 0; i < map.length(); i++) {
            keypadComb(str, idx + 1, combination + map.charAt(i));
        }
    }

    public static void main(String[] args) {
        // fernheit();

        // printNum(6);

        // System.out.println(sumNum(4, 5));

        // System.out.println(factorial(20));

        // System.out.println(fibonnaci(6));

        // System.out.println(power(2, 10));

        // towerOfHanoi(3, "S", "H", "D");

        // reverseString("abhishek", 7);

        // firstLastOcc("babaabbcacb", 0, 'a');

        // int arr[] = { 1, 3, 5, 5 };
        // System.out.println(isSorted(arr, 0));

        // moveAllX("bxdxxcbcxcb", 0, 0, "");

        // removeDup("babaabbcacb", 0, "");

        // subSeq("abc", 0, "");

        // HashSet<String> set = new HashSet<>();
        // uniqSubSeq("aaa", 0, "", set);

        keypadComb("4", 0, "");
    }
}

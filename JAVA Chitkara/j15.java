import java.util.Scanner;
import java.util.Arrays;

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

    public static void main(String[] args) {
        // fernheit();
        // printNum(6);
        // System.out.println(sumNum(4, 5));
        // System.out.println(factorial(20));
        // System.out.println(fibonnaci(6));
        // System.out.println(power(2, 10));
        // towerOfHanoi(3, "S", "H", "D");
        // reverseString("abhishek", 7);
    }
}

import java.lang.reflect.Array;
import java.util.*;

public class prac {
    public static void deciToBin(int n) {
        String res = "";
        if (n / 2 == 0) {
        } else {
            deciToBin(n / 2);
        }
        res += Integer.toString(n % 2);
        System.out.print(res);
    }

    public static int countDig(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count = count + 1;
        }
        return count;
    }

    public static boolean checkArm(int n) {
        int sum = 0, x = n;
        int p = countDig(n);
        while (n != 0) {
            sum += Math.pow(n % 10, p);
            n /= 10;
        }
        if (sum == x) {
            return true;
        }
        return false;
    }

    public static void armstrongBetweenab(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            if (checkArm(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void neonNumber(int n) {
        int sum = 0;
        double sq = Math.pow(n, 2);
        while (sq != 0) {
            sum += sq % 10;
            sq /= 10;
        }
        if (n == sum) {
            System.out.println("a Neon Number");
        } else {
            System.out.println("not a Neon Number");
        }
    }

    public static void noOfOnes(int A) {
        int count = 0;
        while (A != 0) {
            if ((A & 1) == 1) {
                count++;
            }
            A = A >> 1;
        }
        System.out.println(count);
    }

    public static void implement_an_integer_array() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res -= arr[i];
        }
        Arrays.sort(arr);
        System.out.println("Maximum: " + arr[4]);
        System.out.println("Minimum: " + arr[0]);

        System.out.println("Subtraction: " + res);
        if (res >= 0) {
            System.out.println("Subtraction result is greater than or equal to Zero");
        } else {
            System.out.println("Subtraction result is less than Zero");
        }
    }

    public static void pipe_warehouse() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    System.out.print(arr[i]);
                }
            }
        }
    }

    public static void diamond() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i + 1; j--) {
                System.out.print(".");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = n; j > i + 1; j--) {
                System.out.print(".");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[arr.length - i];
        }
    }

    public static void matricReverse() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = c - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void union() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < m + n; i++) {
            int x = sc.nextInt();
            s.add(x);
        }
        System.out.println(s.size());
    }

    public static void reverseKth() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = x - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length - 1; i >= x; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void runningSum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            sum += x;
            System.out.print(sum + " ");
        }
    }

    public static int revNum(int n) {
        int res = 0;
        while (n != 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }
        return res;
    }

    public static void reverseNumbers() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            System.out.print(revNum(x) + " ");
        }
    }

    public static void missingNumber() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] != i) {
                System.out.println(i);
                break;
            } else {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        // deciToBin(33);
        // checkArm(6);
        // armstrongBetweenab(100, 10000);
        // neonNumber(0);
        // noOfOnes(10);
        // implement_an_integer_array();
        // pipe_warehouse();
        // diamond();
        // matricReverse();
        // union();
        // reverseKth();
        // runningSum();
        // reverseNumbers();
        missingNumber();
    }
}

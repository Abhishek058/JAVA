import java.util.*;

public class prac {
    public static void deciToBin(int n) {
        if (n / 2 == 0) {
            System.out.print(n % 2);
        } else {
            deciToBin(n / 2);
            System.out.print(n % 2);
        }
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
        for (int i = a+1; i < b; i++) {
            if (checkArm(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // deciToBin(33);
        // checkArm(6);
        armstrongBetweenab(100, 10000);
    }
}

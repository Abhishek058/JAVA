import java.util.Scanner;

public class j17 {
    public static int power(int n, int x) {
        if (x == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        return n * power(n, x - 1);
    }

    public static void populateArr(int n) {
        int[] arr = new int[n];
        int i = 0, j = n - 1, k = 1;
        while (i <= j) {
            if (k % 2 == 1) {
                arr[i] = k;
                i++;
            } else {
                arr[j] = k;
                j--;
            }
            k++;
        }
        for (int a = 0; a < n; a++) {
            System.out.print(arr[a] + " ");
        }
    }

    public static void main(String[] args) {
        // System.out.println(power(2, 3));
        populateArr(6);
    }
}

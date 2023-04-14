import java.util.Scanner;

public class j7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int zeroCount = 0, oneCount = 0, twoCount = 0;

        for (int i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    zeroCount++;
                    break;
                case 1:
                    oneCount++;
                    break;
                case 2:
                    twoCount++;
                    break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < zeroCount) {
                arr[i] = 0;
            } else if (i < zeroCount + oneCount) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int x=1;
            for (int j = n; j >= i; j--) {
                System.out.print(x++);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}

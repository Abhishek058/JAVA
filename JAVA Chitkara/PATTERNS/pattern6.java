import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x++);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}

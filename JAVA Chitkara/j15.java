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

    public static void main(String[] args) {
        fernheit();
    }
}

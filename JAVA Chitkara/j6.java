import java.util.Scanner;

public class j6 {
    public static void ageCri() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int age = sc.nextInt();

            if (age >= x && age < y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void maxBurger() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int bun = sc.nextInt();
            int patty = sc.nextInt();

            if (bun < patty) {
                System.out.println(bun);
            } else {
                System.out.println(patty);
            }
        }
    }

    public static void biryani() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(x * y);
        }
    }

    public static void main(String[] args) {
        ageCri();
        // maxBurger();
        // biryani();
    }
}

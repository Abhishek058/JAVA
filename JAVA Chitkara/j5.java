import java.util.Scanner;

public class j5 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float m = (float) n;

        System.out.println(n);
        System.out.println(m);

        if (n == m) {
            System.out.println("not same type");
        } else {
            System.out.println("same type");
        }

        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("INVALID");
        }
        sc.close();
    }
}

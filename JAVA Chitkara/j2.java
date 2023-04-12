import java.util.Scanner;

public class j2 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello we are taking inputs");
        System.out.println("Enter integer:");
        int i = sc.nextInt();
        System.out.println("Enter float:");
        float f = sc.nextFloat();
        System.out.println("Enter string: ");
        String s = sc.next();
        System.out.println("Enter Sentence: ");
        String x = sc.nextLine();

        System.out.println(i);
        System.out.println(f);
        System.out.println(s);
        System.out.println(x);

        sc.close();
    }
}

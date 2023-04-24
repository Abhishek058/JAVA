import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class j14 {

    public static void getBit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: "); // 5 - 0101
        int n = sc.nextInt();
        System.out.print("Enter Position: "); // 2
        int pos = sc.nextInt();
        int x = (1 << pos) & n; // One

        if (x == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("One");
        }
        sc.close();
    }

    public static void setBit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        int x = (1 << pos) | n;
        System.out.println("After setting: " + x);
        sc.close();
    }

    public static void clearBit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        int x = (~(1 << pos)) & n;
        System.out.println("After clearing: " + x);
        sc.close();
    }

    public static void updateBit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();
        System.out.print("Updating Bit: ");
        int uBit = sc.nextInt();
        int x;
        if (uBit == 0) {
            x = (~(1 << pos)) & n;
        } else {
            x = (1 << pos) | n;
        }
        System.out.println("After Updating: " + x);
        sc.close();
    }

    public static void main(String[] args) {
        // getBit();
        // setBit();
        // clearBit();
        updateBit();
    }
}

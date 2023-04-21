import java.util.Scanner;

class A {
    private int sum;

    public A() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();
        sum = num1 + num2 + num3;
    }

    public int getSum() {
        return sum;
    }
}

class B {
    private int sum;

    public B(A objA) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();
        sum = num1 + num2 + num3 + objA.getSum();
    }

    public int getSum() {
        return sum;
    }}

public class j12{

    public static void main(String[] args) {
        A objA = new A();
        B objB = new B(objA);
        System.out.println("Sum of class A: " + objA.getSum());
        System.out.println("Sum of class B: " + objB.getSum());
    }
}

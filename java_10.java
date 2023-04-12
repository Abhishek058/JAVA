import java.util.Scanner;

//Lecture 10 in which we will learn about Loops

public class java_10 {
    public static void main(String[] args) {
        // for loop
        // for (int i = 1; i <= 10; i += 2) {
        // System.out.println(i);
        // }
        // for (int i = 10; i > 0; i -= 2) {
        // System.out.println(i);
        // }

        // while loop
        // int j = 1;
        // while(j<=10){
        // System.out.println(j);
        // j+=1;
        // }

        // Do While loop
        // int k = 10;
        // do {
        // System.out.println(k);
        // k = k - 2;
        // } while (k >= 1);

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Input number: ");
            n = sc.nextInt();
            System.out.print("Your number: ");
            System.out.println(n);
        } while (n > 0);
        System.out.println("********END********");
        sc.close();
    }
}
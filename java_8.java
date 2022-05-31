
//Lecture 8 in which we will learn about Conditional statement
import java.util.Scanner;

public class java_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Can Vote");
        } else {
            System.out.println("Cannot Vote");
        }
    }
}
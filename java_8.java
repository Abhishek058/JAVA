//Lecture 8 in which we will learn about Conditional statement

import java.util.Scanner;

public class java_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Input Age: ");
        // int age = sc.nextInt();

        // if (age >= 18) {
        //     System.out.println("Can Vote");
        // } else {
        //     System.out.println("Cannot Vote");
        // }

        System.out.println("Input A: ");
        int a = sc.nextInt();
        System.out.println("Input B: ");
        int b = sc.nextInt();
        System.out.println("Input C: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is max");
        }
        
        else if(b>c && b>a){
            System.out.println("B is max");
        }
        
        else if(c>a && c>a){
            System.out.println("C is max");
        }
        sc.close();
    }
}
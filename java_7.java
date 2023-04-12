import java.util.Scanner;

public class java_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /********Integer input*********/
        // System.out.println("Input Integer: ");
        // float age = sc.nextFloat();
        // System.out.println(age);

        /********String input*********/
        // System.out.println("Input String: ");
        // String name = sc.next();
        // System.out.println(name);
        
        /********Sentence input*********/
        System.out.println("Input Sentence: ");
        String sentence = sc.nextLine();
        System.out.println(sentence);
        sc.close();
    }
}
import java.util.Scanner;

public class j20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a Name: ");
            String name = sc.next();
            if (name.matches("[a-zA-Z]+")) {
                System.out.println("The name you entered is: " + name);
            } else {
                throw new Exception("Invalid name");
            }
            System.out.print("Enter a Marks: ");
            int marks = sc.nextInt();
            if (marks < 100) {
                System.out.println("The marks you entered is: " + marks);
            } else {
                throw new Exception("Invalid Marks");
            }
            System.out.print("Enter a Age: ");
            int age = sc.nextInt();
            if (age > 0) {
                System.out.println("The age you entered is: " + age);
            } else {
                throw new Exception("Invalid Age");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
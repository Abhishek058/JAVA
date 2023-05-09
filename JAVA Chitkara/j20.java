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
    }
}

// class InvalidNameException extends Exception {
// public InvalidNameException(String name) {
// // calling the constructor of parent Exception
// super(name);
// }
// }

// class InvalidMarksException extends Exception {
// public InvalidMarksException(String marks) {
// // calling the constructor of parent Exception
// super(marks);
// }
// }

// class InvalidAgeException extends Exception {
// public InvalidAgeException(String age) {
// // calling the constructor of parent Exception
// super(age);
// }
// }

// // class that uses custom exception InvalidAgeException
// public class j20 {

// // method to check the age
// static void validateName(String name) throws InvalidAgeException {
// if (age < 18) {

// // throw an object of user defined exception
// throw new InvalidAgeException("age is not valid to vote");
// } else {
// System.out.println("welcome to vote");
// }
// }

// static void validateMarks(int age) throws InvalidAgeException {
// if (age < 18) {

// // throw an object of user defined exception
// throw new InvalidAgeException("age is not valid to vote");
// } else {
// System.out.println("welcome to vote");
// }
// }

// static void validateAge(int age) throws InvalidAgeException {
// if (age < 18) {

// // throw an object of user defined exception
// throw new InvalidAgeException("age is not valid to vote");
// } else {
// System.out.println("welcome to vote");
// }
// }

// // main method
// public static void main(String args[]) {
// try {
// // calling the method
// validate(13);
// } catch (InvalidAgeException ex) {
// System.out.println("Caught the exception");

// // printing the message from InvalidAgeException object
// System.out.println("Exception occured: " + ex);
// }

// System.out.println("rest of the code...");
// }
// }

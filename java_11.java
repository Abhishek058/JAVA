//Lecture 11 in which we will learn about Exception Handling

public class java_11 {
    public static void main(String[] args) {
        int[] marks = { 97, 89, 95 };
        try {
            System.out.println(marks[5]);
        } catch (Exception exception) {
            // do something after catching
        }
        System.out.println("My name is Abhishek");
    }
}
class Student {
    String name;
    int rollno;

    // Default constructor
    Student() {
        System.out.println("Constructor Called");
    }

    // Parameterised Constructor
    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    // No distructor in java it has its own garbage store

    // Polymorphism
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int rollno) {
        System.out.println(rollno);
    }

    public void printInfo(String name, int rollno) {
        System.out.println(name + " " + rollno);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhishek";
        s1.rollno = 1234;

        s1.printInfo("Abhishek");
        s1.printInfo(32);
        s1.printInfo("abhishek", 32);
    }
}
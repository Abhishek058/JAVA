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
    // No distructor in java it hase some garbage store

    public void printName() {
        System.out.println(this.name);
    }

    public void printRoll() {
        System.out.println(this.rollno);
    }
}

public class polymorphism {
    public static void main(String[] args) {

    }
}
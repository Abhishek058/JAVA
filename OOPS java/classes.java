import java.util.Scanner;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void getcolor() {
        System.out.println(this.color);
    }

    public void gettype() {
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int rollno;

    public void getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Name: ");
        name = sc.nextLine();
    }

    public void getroll() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input RollNo: ");
        rollno = sc.nextInt();
    }

    public void printName() {
        System.out.println(this.name);
    }

    public void printRoll() {
        System.out.println(this.rollno);
    }
}

public class classes {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();
        // pen1.getcolor();
        // pen1.gettype();

        Student s1 = new Student();
        s1.getName();
        s1.getroll();
        s1.printName();
        s1.printRoll();
    }
}
class Shape {
    int age;
    public void area() {
        System.out.println("Area: ");
    }
}

class Triangle extends Shape {
    public void area(int a, int b) {
        System.out.println((a * b) / 2);
    }
}

class Circle extends Shape {
    public void area(int a) {
        System.out.println((a * a) * 3.14);
    }
}

public class java13 {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.age=20;
        System.out.println(t1.age);
    }
}
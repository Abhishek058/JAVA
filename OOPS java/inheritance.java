class Shape {
    public void area(){
        System.out.println("Area: ");
    }
}

class Triangle extends Shape{
    public void area(int a, int b){
        System.out.println((a*b)/2);
    }
}

class Circle extends Shape{
    public void area(int a){
        System.out.println((a*a)*3.14);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();

        t1.area(3, 8);
        c1.area(3);
    }
}
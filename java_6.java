//Lecture 6 in which we will learn about Operators

public class java_6 {
    public static void main(String[] args) {
        double a = 8;
        double b = 3;
        double sum = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        double mod = a % b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        //Urinary operator
        int c = 4;
        System.out.println(c++);
        System.out.println(++c);

        System.out.println(c--);
        System.out.println(--c);

        //Maths class function
        System.out.println(Math.max(242,751));
        //max, min, random, 
    }
}
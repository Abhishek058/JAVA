//Lecture 5 in which we will learn about Casting

public class java_5 {
    public static void main(String[] args) {
        double price = 100.00;
        double finalprice = price + 18; //implicit casting

        System.out.println(finalprice);

        int p = 100;
        int fp = p + (int)18.78;  //explicit casting
        System.out.println(fp);
        
        int age = 30;
        age = 31;
        age = 32;
    }
}
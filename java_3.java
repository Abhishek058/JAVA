//Lecture 3 in which we will learn about String

public class java_3 {
    public static void main(String[] args) {
        String name1 = "Aman";
        String name2 = "Dhattarwal";

        String name3 = name1 + " " + name2;
        
        System.out.println(name3);
        
        System.out.println(name2.charAt(3));
        
        System.out.println(name3.length());
        
        String name4 = name1.replace("A", "C");
        System.out.println(name4);

        System.out.println(name2.substring(1, 5));
    }
}
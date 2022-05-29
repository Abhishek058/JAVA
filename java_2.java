//Lecture 1 in which we will learn about DataType

public class java_2 {
    public static void main(String[] args) {

        // byte -1 [-128 to 127] bytes
        // short - 2 bytes
        // int - 4 bytes
        // long - 8 bytes
        // float - 4 bytes
        // double - 8 bytes
        // char - 2 bytes
        // boolean - 1 bytes


        /****PREMETIVE DATATYPE ****/
        byte age = 30;
        int phone = 1234567890;
        long phone2 = 1234567890987654321L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = true;

        System.out.println(age);
        System.out.println(phone);
        System.out.println(phone2);
        System.out.println(pi);
        System.out.println(letter);
        System.out.println(isAdult);

        /****NON-PREMITIVE DATATYPE */
        String name = "Aman";
        System.out.println(name.length());
    }
}
// import java.io.FileOutputStream;

// public class j29 {
//     public static void main(String args[]) {
//         try {
//             FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
//             String s = "Welcome to javaTpoint.";
//             byte b[] = s.getBytes();// converting string into byte array
//             fout.write(b);
//             fout.close();
//             System.out.println("success...");
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

import java.io.FileInputStream;

public class j29 {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("D:\\testout.txt");
            int i = fin.read();
            System.out.print((char) i);

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
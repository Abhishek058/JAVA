// abstract class Bank {
//     abstract int Intrest();
// }

// class SBI extends Bank {
//     int p;
//     int r;
//     int t;

//     public SBI(int p, int r, int t) {
//         this.p = p;
//         this.r = r;
//         this.t = t;
//     }

//     int Intrest() {
//         return p * r * t;
//     }
// }

// public class j18 {
//     public static void main(String[] args) {
//         SBI obj = new SBI(5, 2, 10);
//         System.out.println(obj.Intrest());
//     }
// }
import java.util.*;
class Demo {
    public void show()
     {
     ArrayList<String> list = new ArrayList<String>();
     list.add("GeeksForGeeks_one"); // line 6
     list.add("GeeksForGeeks_two");
     System.out.print(list.getFirst()); // line 8
     }
    } public class j18 {
    public static void main(String[] args)
     {
     Demo demo = new Demo();
     demo.show();
     }
    }
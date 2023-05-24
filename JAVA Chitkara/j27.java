import java.util.Scanner;

public class j27 {
    public static void reverseWord() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String x = str.trim();
        String[] arr = x.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i].trim();
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = Character.toUpperCase(str.charAt(0));
        String res = "";
        res += ch;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                res += str.charAt(i);
            }
        }
        System.out.println(res);
    }
}

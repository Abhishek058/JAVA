import java.util.Scanner;

public class j24 {
    public static void subString(String str) {
        int n = str.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        subString(str);
        sc.close();
    }
}

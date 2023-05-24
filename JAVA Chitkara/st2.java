// import java.util.*;

// public class st2 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         Set<Character> set = new HashSet<>();
//         for(int i=0;i<str.length();i++){
//             set.add(str.charAt(i));
//         }
//         for(char ch : set){
//             System.out.print(ch);
//         }
//     }
// }

// import java.util.*;

// public class st2 {
//     public static void result(String str, int n) {
//         if (n > str.length()) {
//             System.out.println(-1);
//         } else {
//             System.out.println(str.length());
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 0; i < n; i++) {
//             String str = sc.nextLine();
//             int k = sc.nextInt();
//             result(str, k);
//         }

//     }
// }

// import java.util.*;

// public class st2 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         boolean[] visited = new boolean[256];
//         Map<Character, Integer> check = new HashMap<>();
//         for (int i = 0; i < str.length(); i++) {
//             if (!visited[str.charAt(i)]) {
//                 int cnt = 1;
//                 for (int j = i + 1; j < str.length(); j++) {
//                     if (str.charAt(i) == str.charAt(j) && i != j) {
//                         cnt++;
//                     }
//                 }
//                 check.put(str.charAt(i), cnt);
//                 visited[str.charAt(i)] = true;
//             }
//         }
//         int max = 0;
//         char ch = 'x';
//         for (Map.Entry<Character, Integer> entry : check.entrySet()) {
//             if (entry.getValue() > max) {
//                 max = entry.getValue();
//                 ch = entry.getKey();
//             }
//             else{
//                 continue;
//             }
//         }
//         System.out.println(ch);

//     }
// }

// import java.util.Scanner;

// public class st2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         StringBuilder result = new StringBuilder();

//         // Append the first character as is
//         result.append(str.charAt(0));

//         if (str.charAt(0) > 64 && str.charAt(0) < 91) {
//             for (int i = 1; i < str.length(); i++) {
//                 char ch = str.charAt(i);

//                 // Toggle the case based on the index
//                 if (i % 2 != 1) {
//                     ch = Character.toUpperCase(ch);
//                 } else {
//                     ch = Character.toLowerCase(ch);
//                 }

//                 result.append(ch);
//             }
//         }

//         if (str.charAt(0) > 96 && str.charAt(0) < 124) {
//             for (int i = 1; i < str.length(); i++) {
//                 char ch = str.charAt(i);

//                 // Toggle the case based on the index
//                 if (i % 2 == 1) {
//                     ch = Character.toUpperCase(ch);
//                 } else {
//                     ch = Character.toLowerCase(ch);
//                 }

//                 result.append(ch);
//             }
//         }

//         // Print the resulting string
//         System.out.println(result.toString());
//     }
// }

// import java.util.Scanner;

// public class st2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int l = sc.nextInt();
// int b = sc.nextInt();
// int r = sc.nextInt();

// int areaRec = l * b;
// double areaCir = 3.14 * r * r;

// System.out.println(areaRec);
// System.out.println(areaCir);
// }
// }

// public class st2 {
// public static void main(String[] args) {
// String A[] = { "abc", "bcd", "cdf" };
// int n = 3;

// }
// }

// import java.util.*;

// public class st2 {
//     public static void uniqSubSeq(String str, int idx, String newString, HashSet<String> set) {
//         if (idx == str.length()) {
//             if (set.contains(newString)) {
//                 return;
//             } else {
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }
//         char currCh = str.charAt(idx);
//         uniqSubSeq(str, idx + 1, newString + currCh, set);
//         uniqSubSeq(str, idx + 1, newString, set);
//     }

//     public static void main(String[] args) {
//         HashSet<String> set = new HashSet<>();
//         uniqSubSeq("abc", 0, "", set);
//     }
// }

// import java.lang.reflect.Array;
// import java.util.Scanner;

// public class st2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int[] cnt = new int[256];

//         for(int i=0;i<str.length();i++){
//             cnt[str.charAt(i)]++;
//         }

//     }
// }

public class st2 {
    public static void main(String[] args) {
        String x = "abc";
        String y = "abc";
        x.concat(y);
        System.out.print(x);
    }

}
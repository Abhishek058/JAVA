import java.util.*;

public class prac {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(3);
        // ArrayList
        // arr1.add(2);
        // arr1.add(3);
        // arr1.add(2);
        // arr2.addAll(arr1);
        // Collections.reverse(arr1);
        // // int n = Integer.parseInt()
        // if (arr1.equals(arr2)) {
        //     System.out.println("true");
        // } else {
        //     System.out.println("false");
        // }

        arr1.addAll(arr2);

        System.out.println(arr1);

    }
}

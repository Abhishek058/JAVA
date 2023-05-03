import java.util.Scanner;
import java.util.Vector;

import javax.swing.plaf.synth.SynthStyle;

class STj18 {
    public static void triplet(int arr[]) {
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = i; k < n; k++) {
                    if (arr[i] + arr[j] == arr[k]) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    public static void descIndx(int arr[]) {
        int n = arr.length;
        int max = -1, idx = 0;
        for (int i = 0; i < n; i++) {
            max = -1;
            for (int j = 0; j < n; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    idx = j;
                }
            }
            System.out.print(idx + " ");
            arr[idx] = 0;
        }
    }

    public static void kthFactor(int n, int p) {
        Vector<Integer> v = new Vector<Integer>();
        v = primeFactors(n);
        System.out.print(v.get(p - 1));
    }

    public static Vector<Integer> primeFactors(int number) {
        Vector<Integer> v = new Vector<Integer>();
        int factor = 2;
        while (factor <= number) {
            if (number % factor == 0) {
                v.add(factor);
                number /= factor;
            } else {
                factor++;
            }
        }
        return v;
    }

    public static void smithNum(int n) {
        Vector<Integer> v = new Vector<Integer>();
        v = primeFactors(n);
        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            sum += sumDigit(v.get(i));
        }
        int sumNum = sumDigit(n);
        if (sumNum == sum) {
            System.out.println("Smith Number");
        } else {
            System.out.println("Not Smith Number");
        }
    }

    public static int sumDigit(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public static int search(Vector<Integer> v, int n) {
        int f = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) == n) {
                f = 1;
                break;
            }
        }
        return f;
    }

    public static void union() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            v.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
            if (search(v, arr2[i]) == 0) {
                v.add(arr2[i]);
            }
        }

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // triplet(arr);
        // descIndx(arr);
        // System.out.print(primeFactors(18));
        // kthFactor(18, 2);
        // for (int i = 0; i < 2; i++) {
        // int x = sc.nextInt();
        // smithNum(x);
        // }
        union();
        sc.close();
        
    }
}
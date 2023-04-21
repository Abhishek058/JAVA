import java.util.Scanner;

class cnt1 {
    int a, b, c, sum1;
    public void input() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sum1 = a+b+c;
    }

    public int getSum() {
        return sum1;
    }
}

class cnt2 extends cnt1 {
    int x, y, z, sum2;
    public void input2() {
        input();
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        sum2 = x+y+z+getSum();
    }

    public int getSum2() {
        return sum2;
    }
}

class j11 {
    public static void main(String[] args) {
        cnt2 obj2 = new cnt2();
        obj2.input2();
        System.out.println(obj2.getSum2());
    }
}
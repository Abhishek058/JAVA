import java.util.Scanner;

class cnt1 {
    int a, b, c;

    public void input() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }

    public int getSum() {
        return a + b + c;
    }
}

class cnt2 extends cnt1 {
    int x, y, z;

    public void input2() {
        input();
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
    }

    public int getSum2() {
        return x + y + z + getSum();
    }
}

class j11 {
    public static void main(String[] args) {
        cnt2 obj2 = new cnt2();
        obj2.input2();
        System.out.println(obj2.getSum2());
    }
}
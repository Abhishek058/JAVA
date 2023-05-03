abstract class Bank {
    abstract int Intrest();
}

class SBI extends Bank {
    int p;
    int r;
    int t;

    public SBI(int p, int r, int t) {
        this.p = p;
        this.r = r;
        this.t = t;
    }

    int Intrest() {
        return p * r * t;
    }
}

public class j18 {
    public static void main(String[] args) {
        SBI obj = new SBI(5, 2, 10);
        System.out.println(obj.Intrest());
    }
}

class swap {
    int n1, n2;

    swap(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public static void swapNum(swap obj) {
        int temp = obj.n1;
        obj.n1 = obj.n2;
        obj.n2 = temp;

        System.out.print("n1: " + obj.n1 + "\nn2: " + obj.n2);
    }
}

public class j16 {
    public static void main(String[] arg) {
        swap x = new swap(4, 6);
        x.swapNum(x);
    }
}

class check {
    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        System.out.println(check.isEven(2));
        System.out.println(check.isOdd(2));
    }
}
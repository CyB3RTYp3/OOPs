class Exception {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 }, b = 4, c = 5, d;
        try {
            d = b / (a[4] - c);
            d = (a[4] - c) / b;
        } catch (ArithmeticException e) {
            System.out.println(e);

        }

        try {
            d = (a[5] - c) / b;
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e);
        }
    };
}
public class practical2_5_2 {
    public static void main(String[] args) {
        System.out.println("Exponent is "+ xMethod(3, 4));
    }

    private static long xMethod(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * xMethod(base, exponent - 1);
        }
    }
}

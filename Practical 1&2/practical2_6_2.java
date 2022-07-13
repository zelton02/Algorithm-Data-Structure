public class practical2_6_2{
    public static void main(String[] args) {
        System.out.println("Exponent is "+ power(3, 4));
    }

    private static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
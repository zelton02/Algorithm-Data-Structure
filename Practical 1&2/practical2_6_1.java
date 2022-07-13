public class practical2_6_1 {
    public static void main(String[] args) {
        System.out.println("Factorial = "+ factorial(4.0));
    }

    private static long factorial(Double i) {
        if (i == 0) {
            return 1;
        } else {
            return (long) (i * factorial(i - 1));
        }
    }
}
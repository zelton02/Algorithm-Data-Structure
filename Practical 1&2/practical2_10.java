public class practical2_10 {
    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }

    private static long power(int i, int j) {
        if (j == 0) {
            return 1;
        } else {
            return i * power(i, j - 1);
        }
    }
}

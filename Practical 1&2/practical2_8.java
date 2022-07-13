public class practical2_8 {
    public static void main(String[] args) {
        linear(5);
    }

    // Recursion 1, 2, 3, 4, 5
    private static void linear(int i) {
        if (i > 0) {
            linear(i - 1);
            System.out.println(i);
        } else {
            System.out.println(0);
        }
    }
}

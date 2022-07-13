public class practical2_5_1 {
    public static void main(String[] args) {
        System.out.println("GCD is " + xMethod(48, 18));
    }

    public static int xMethod(int a, int b) {
        int remainder = a % b;
        if (remainder == 0) {
            return b;
        } else {
            return xMethod(b, remainder);
        }
    }
}
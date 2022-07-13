public class practical2_9 {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static long sum(int i) {
        if (i == 0) {
            return 0;
        } else {
            return i*i + sum(i - 1);
        }
    }
}

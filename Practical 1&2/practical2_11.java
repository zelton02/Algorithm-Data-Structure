public class practical2_11 {
    public static void main(String[] args) {
        System.out.print(binaryPrint(19));
    }

    private static int binaryPrint(int i) {
        if (i == 0) {
            return 0;
        } else {
            binaryPrint(i / 2);
            return i % 2;
        }
    }
}

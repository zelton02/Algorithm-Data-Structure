public class naturalNumber {
    public static void main(String[] args) {
        System.out.println(naturalNumber(10));
    }

    private static int naturalNumber(int i) {
        if (i == 0)
            return i;
        return i + naturalNumber(i - 1);
    } 
}

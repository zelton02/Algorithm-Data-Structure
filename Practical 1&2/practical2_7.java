public class practical2_7 {
    public static void main(String[] args) {
        printNumber(5);;
    }

    private static void printNumber(int i) {
        if (i > 0){
            System.out.print(i + " ");
            printNumber(i-1);
        }

        // if (i == 0) {
        //     System.out.println("0");
        // } else {
        //     return i + ", " + printNumber(i - 1);
        // }
    }
}

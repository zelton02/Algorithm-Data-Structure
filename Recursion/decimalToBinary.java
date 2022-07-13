public class decimalToBinary {
    public static void main(String[] args) {
        String binary = findBinary(116, "");
    }

    public static String findBinary(int num, String result){
        if (num == 0) 
            return result;

        result = num%2+ result;
        return findBinary(num/2, result);
    }
}
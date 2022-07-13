public class palindrome2 {
    public static void main(String[] args) {
        if (isPalindrome("HeloleH")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isPalindrome(String string) {
        if (string.length()==0 || string.length()==1) {
            return true;
        } else {
            if (string.charAt(0) == string.charAt(string.length()-1)) {
                return isPalindrome(string.substring(1, string.length()-1));
            } else {
                return false;
            }
        }
    }
}

public class palindrome {
    public static void main(String[] args) {
        if (isPalindrome("HeloleH")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // System.out.println(1/2);
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return isPalindrome(s.substring(1, s.length() - 1));
            } else {
                return false;
            }
        }
    }
}

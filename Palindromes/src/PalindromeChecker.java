/**
 * Palindrome - word or sequence which reads the same backwards as forwards: e.g. madam
 */

public class PalindromeChecker {

    public PalindromeChecker() {
    }

    public boolean isPalindrome(String s) {
        String reverse = "";
        for(int i = s.length() -1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        return s.equals(reverse);
    }

    public boolean recursiveIsPalindrome(String s) {
        if(s.length() == 1 || s.length() == 0) { return true; }
        if(s.charAt(0) == s.charAt(s.length()-1)) {
            return recursiveIsPalindrome(s.substring(1, s.length()-1));
        }
        return false;
    }
}

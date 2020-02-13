public class PalindromeCheckerTest {

    public static void main(String[] args) {
        PalindromeChecker p_checker = new PalindromeChecker();

        System.out.println("Palindromes: ");
        System.out.println(p_checker.recursiveIsPalindrome("madam"));
        System.out.println(p_checker.recursiveIsPalindrome("anna"));
        System.out.println(p_checker.recursiveIsPalindrome("level"));

        System.out.println();

        System.out.println("Non-Palindromes: ");
        System.out.println(p_checker.recursiveIsPalindrome("today"));
        System.out.println(p_checker.recursiveIsPalindrome("computer"));
        System.out.println(p_checker.recursiveIsPalindrome("channel"));

    }
}

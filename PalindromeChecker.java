import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static void main(String[] args) {
    
        String word = "madam";
        boolean isPalindrome = isPalindrome(word);

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
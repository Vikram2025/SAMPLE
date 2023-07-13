package PreparationExample;


import java.util.Scanner;

public class PalindromeQuestion {
    public static boolean isPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String back = "";
 
        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            back = back + str.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (str.equals(back)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        // Input string
    	Scanner scan = new Scanner(System.in);
    	System.out.println("enter the name to find out if it's palindrome or not");
        String str = scan.next();
 
        // Convert the string to lowercase
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}
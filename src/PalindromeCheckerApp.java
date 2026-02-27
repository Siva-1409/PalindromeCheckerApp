import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // UC1
        System.out.println("Welcome to Palindrome Checker Management App");
        System.out.println("Version: 1.0");
        System.out.println();

        // UC2 - Hardcoded Palindrome
        String input = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
        System.out.println();

        // UC3 - Reverse String Method
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        boolean isPalindromeUC3 = input.equals(reversed);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome (Using Reverse)? : " + isPalindromeUC3);
    }
}
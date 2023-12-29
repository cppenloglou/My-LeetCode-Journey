class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int reversedNumber = 0;
        if(x < 0)return false;
        if(x < 10)return true;
        while (x != 0) {
            int digit = x % 10;
            reversedNumber = reversedNumber * 10 + digit;
            x = x / 10;
        }
        if(y == reversedNumber)return true;
        return false;
    }
}

public class Palindrome_Number {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: Palindrome number
        System.out.println("Is 121 a palindrome? " + String.valueOf(solution.isPalindrome(121))); // Output: true

        // Example 2: Non-palindrome number
        System.out.println("Is 123 a palindrome? " + String.valueOf(solution.isPalindrome(123))); // Output: false

        // Example 3: Negative number (not a palindrome)
        System.out.println("Is -121 a palindrome? " + String.valueOf(solution.isPalindrome(-121))); // Output: false

        // Example 4: Single-digit number (always a palindrome)
        System.out.println("Is 7 a palindrome? " + String.valueOf(solution.isPalindrome(7))); // Output: true
    }
}


class Solution {
    public int reverse(int x) {
        double reversedNumber = 0;
        
        if(x > Math.pow(2, 31) || x < -Math.pow(2,31))
            return 0;

        
       while (x != 0) {
            int digit = x % 10;
            reversedNumber = reversedNumber * 10.0 + digit;
            x = x / 10;
        }
        
        if(reversedNumber > Math.pow(2, 31) || reversedNumber < -Math.pow(2,31))
            return 0;
        
        return ((int)reversedNumber);
    }
}

// Input: x = 123
// Output: 321

class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 123;
        int solved = solution.reverse(x);
        System.out.print("Reversed number = " + solved);
    }
}
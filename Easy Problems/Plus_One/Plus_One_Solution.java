
class Lisi {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

class Begin {
    public static void main(String[] args) {
        Lisi lisi = new Lisi();

        int[]  digits = {1,2,3};
        
        int[] solutionTable = new int[10];
        
        solutionTable = lisi.plusOne(digits);
        for(int number : solutionTable)
            System.out.print(number + " ");


    }
}
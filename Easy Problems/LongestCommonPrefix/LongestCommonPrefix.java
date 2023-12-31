class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        char[] firstWord = strs[0].toCharArray();
        int j = 0;
        int i = 0;
        for (i = 0; i < strs[0].length(); i++){
            for (j = 1; j < length; j++) {
                if (strs[j].toCharArray().length == i || firstWord[i] != strs[j].charAt(i)) {
                    break;
                }
            }
            if (j != length){
                break;
            }

        }

        return strs[0].substring(0,i);
    }
}

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String s  = Solution.longestCommonPrefix(new String[]{"flower", "fleet", "flowe"});
        System.out.println(s);
    }
}
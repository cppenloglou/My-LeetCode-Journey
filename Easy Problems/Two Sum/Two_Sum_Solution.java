import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }

            // Add the current number and its index to the map
            numIndexMap.put(nums[i], i);
        }

        // No solution found
        return new int[]{0, 0};
    }
}

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int []nums = {2,7,11,15};
        int target = 9;
        int[] solutionTable;
        
        solutionTable = solution.twoSum(nums, target);
        for(int number : solutionTable)
            System.out.print(number + " ");


    }
}
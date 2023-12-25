class Solution(object):
    def lengthOfLongestSubstring(self, s):
        n = len(s)
        result = 0
        char_index_map = {}

        i, j = 0, 0
        while j < n:
            current_char = s[j]

            if current_char in char_index_map:
                i = max(char_index_map[current_char] + 1, i)

            result = max(result, j - i + 1)

            char_index_map[current_char] = j
            j += 1

        return result
    
    
# Example 1:

# Input: s = "abcabcbb"
# Output: 3
# Explanation: The answer is "abc", with the length of 3.

solution = Solution()
input_str = "abcabcbb"
output_length = solution.lengthOfLongestSubstring(input_str)

print(f"Input: s = \"{input_str}\"")
print(f"Output: {output_length}")
print(f"Explanation: The answer is \"{input_str[:output_length]}\", with the length of {output_length}.")

class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sol = 1
        sum_ = 0
        for i in range(len(nums)):
            sol = sol + i
            sum_ = sum_ + nums[i]
        return sol + i - sum_
    
if __name__ == "__main__":
    sol = Solution()
    print(sol.missingNumber([1,2,3,4]))
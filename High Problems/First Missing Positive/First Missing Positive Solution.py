class Solution(object):
    def first_missing_positive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sol = 1
        sorted_ = sorted(nums)
        i = 1
        for i in range(len(sorted_)):
            if sol == sorted_[i]:
                sol = sol + 1
        return sol
    

if __name__ == "__main__":
    sol = Solution()
    print(sol.first_missing_positive([1,2,3,4,56545,53,-2345,324,6,5,7]))
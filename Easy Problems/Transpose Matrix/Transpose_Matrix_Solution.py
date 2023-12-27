class Solution:
    def transpose(self, matrix):
        # Use zip with * to transpose the matrix
        result = [list(row) for row in zip(*matrix)]
        return result

matrix = [[1,2,3],[4,5,6],[7,8,9]]
obj = Solution()
print(obj.transpose(matrix))
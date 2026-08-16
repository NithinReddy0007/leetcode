class Solution:
    def minMoves(self, nums: List[int]) -> int:
        x=max(nums)
        summ=0
        for el in nums:
            summ+=abs(el-x)
        return summ
            
                
        
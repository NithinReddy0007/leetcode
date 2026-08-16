class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count=0
        for el in nums:
            if len(str(el))%2==0:
                count+=1
        return count
        
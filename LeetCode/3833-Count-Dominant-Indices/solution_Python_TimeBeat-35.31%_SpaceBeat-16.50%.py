class Solution:
    def dominantIndices(self, nums: List[int]) -> int:
        s=sum(nums)
        n=len(nums)
        count=0
        for i in range(n-1):
            if float(nums[i])>(s-nums[i])/(n-i-1):
                count+=1
            s-=nums[i]
        return count
        
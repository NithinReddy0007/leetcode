class Solution:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        summ=0
        for i in range (len(nums)):
            if nums[i]<0:
                nums[i]=-nums[i]
        nums.sort()
        i=0
        j=len(nums)-1
        while i<=j:
            if i==j:
                summ+=nums[i]**2
            else:
                summ+=nums[j]**2-nums[i]**2
            i+=1
            j-=1
        return summ
        
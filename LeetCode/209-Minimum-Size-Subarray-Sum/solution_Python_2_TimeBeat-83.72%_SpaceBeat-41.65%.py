class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        n=len(nums)
        min_length=n+1
        summ=0
        i=0
        j=0

        while j<n:
            summ+=nums[j]
            while i<j and summ-nums[i]>=target:
                summ-=nums[i]
                i+=1
            if summ>=target:
                min_length=min(min_length,j-i+1)
            j+=1
        return min_length if min_length!=n+1 else 0
        
            
            
        
        
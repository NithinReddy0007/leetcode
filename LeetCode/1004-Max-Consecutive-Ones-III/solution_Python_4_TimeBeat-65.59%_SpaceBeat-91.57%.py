class Solution(object):
    def longestOnes(self, nums, k):
        zero=0
        i=0
        j=0
        n=len(nums)
        max_len=0

        while j<n:
            if nums[j]==0:
                zero+=1
            if zero>k:
                if nums[i]==0:
                    zero-=1
                i+=1
            max_len=max(max_len,j-i+1)
            j+=1
        return max_len
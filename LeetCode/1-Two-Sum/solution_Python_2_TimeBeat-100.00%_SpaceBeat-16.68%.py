class Solution(object):
    def twoSum(self, nums, target):
        n=len(nums)
        dict1={}
        for i in range (n):
            r=target-nums[i]
            if r in dict1:
                return [dict1[r],i]
            else:
                dict1[nums[i]]=i
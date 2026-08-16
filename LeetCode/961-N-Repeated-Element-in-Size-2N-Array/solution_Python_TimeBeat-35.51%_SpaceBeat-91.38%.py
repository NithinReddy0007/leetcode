class Solution(object):
    def repeatedNTimes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        d={}
        n=len(nums)
        for el in nums:
            if el not in d:
                d[el]=1
            else:
                d[el]+=1
            if d[el]==n//2:
                return el
        
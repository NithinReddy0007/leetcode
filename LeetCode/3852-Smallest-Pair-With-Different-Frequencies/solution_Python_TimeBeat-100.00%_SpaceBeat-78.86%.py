class Solution:
    def minDistinctFreqPair(self, nums: list[int]) -> list[int]:
        nums.sort()
        d={}
        for el in nums:
            if el not in d:
                d[el]=1
            else:
                d[el]+=1
        ans=[-1,-1]
        x=nums[0]
        for el in d:
            if d[x]!=d[el]:
                return [x,el]
        return ans
        
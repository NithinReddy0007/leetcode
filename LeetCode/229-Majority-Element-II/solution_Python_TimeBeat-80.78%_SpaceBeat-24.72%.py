class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        d={}
        a=[]
        n=len(nums)
        for el in nums:
            if el not in d:
                d[el]=1
            else:
                d[el]+=1
        for el in d:
            if d[el]>n/3:
                a.append(el)
        return a
        
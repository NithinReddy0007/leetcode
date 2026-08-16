class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        d={}
        a=[]
        for el in nums:
            if el not in d:
                d[el]=1
            else:
                d[el]+=1
        for el in d:
            if d[el]==1:
                a.append(el)
        return a
        
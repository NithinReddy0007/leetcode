class Solution:
    def sumDivisibleByK(self, nums: List[int], k: int) -> int:
        d={}
        summ=0
        for el in nums:
            if el not in d:
                d[el]=1
            else:
                d[el]+=1
        for el in nums:
            if d[el]%k==0:
                summ+=el
        return summ
        
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        maxx=0
        summ=0
        for el in nums:
            maxx+=1
            summ+=el
        return ((maxx*(maxx+1))//2)-summ
        
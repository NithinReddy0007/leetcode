class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        num=1
        while True:
            if num%k==0 and num not in nums:
                return num
            num+=1
        
        
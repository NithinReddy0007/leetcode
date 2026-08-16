class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n=len(nums)
        start=0
        count=0
        for i in range (n):
            if nums[i]!=nums[start]:
                start+=1
                nums[start]=nums[i]
                count+=1
        return start+1
        
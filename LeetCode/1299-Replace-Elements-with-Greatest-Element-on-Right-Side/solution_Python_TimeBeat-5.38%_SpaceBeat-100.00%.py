class Solution:
    def replaceElements(self, nums: List[int]) -> List[int]:
        maxx=-1
        for i in range(len(nums)-1,-1,-1):
            temp=maxx
            maxx=max(maxx,nums[i])
            nums[i]=temp
        return nums
            
        
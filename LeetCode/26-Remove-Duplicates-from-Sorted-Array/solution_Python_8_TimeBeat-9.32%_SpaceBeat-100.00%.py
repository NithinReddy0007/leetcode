class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l=nums[:]
        nums.clear()
        for i in range (len(l)):
            if l[i] not in nums:
                nums.append(l[i])
        return len(nums)
        
        
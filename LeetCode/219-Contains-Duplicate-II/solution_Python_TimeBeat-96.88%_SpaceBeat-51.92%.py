class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        isdup={}
        for i in range (len(nums)):
            if nums[i] in isdup:
                if abs(isdup[nums[i]]-i)<=k:
                    return True
            isdup[nums[i]]=i
        return False
        
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        nums=nums1+nums2
        nums.sort()
        l=len(nums)
        if l%2==0:
            a=nums[l/2]/2.0+nums[l/2-1]/2.0
        else:
            a=nums[l//2]
        return a



        
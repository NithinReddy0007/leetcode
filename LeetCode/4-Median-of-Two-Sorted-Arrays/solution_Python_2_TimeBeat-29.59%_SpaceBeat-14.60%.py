class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        nums=sorted(nums1+nums2)
        l=len(nums)
        if l%2==0:
            return (nums[l/2]+nums[l/2-1])/2.0
        else:
            return float(nums[l//2])



        
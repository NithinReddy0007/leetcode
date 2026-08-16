class Solution:
    def sortArrayByParityII(self, nums: List[int]) -> List[int]:
        a=[0]*len(nums)
        print(a)
        j=0
        for i in range(len(nums)):
            if nums[i]%2==0:
                a[j]=nums[i]
                j+=2
        j=1
        for i in range(len(nums)):
            if nums[i]%2!=0:
                a[j]=nums[i]
                j+=2
        return a


        
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        if nums.count(0)==len(nums):
            return 0
        for i in range (len(nums)):
            if nums[i]<0:
                nums[i]=-nums[i]
        nums.sort(reverse=True)
        i=0
        x=10**5
        k=0
        pro=1
        while i<2:
            if nums[i]!=0:
                pro=pro*nums[i]
                i+=1
            k+=1
            if k==len(nums)-1:
                break
        if k==len(nums)-1 and i==1:
            return 0
        if pro<0:
            pro=pro*(-x)
        else:
            pro=pro*(x)
        return pro
                
            
        
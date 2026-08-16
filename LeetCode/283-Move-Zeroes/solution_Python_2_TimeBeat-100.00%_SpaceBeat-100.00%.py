class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
    
        """
        n=len(nums)
        if n<=1:
            return 
        i=0
        j=0
        for j in range(n):
            if nums[j]!=0:
                nums[i]=nums[j]
                i+=1
            if j==n-1:
                for k in range (i,n):
                    nums[k]=0
            
                

            
        
class Solution:
    def gcd(self,x,y):
        if y==0:
            return x
        return self.gcd(y,x%y)
    def cal(self,nums,i,j):
        num = nums[i]*nums[j]
        den = gcd(nums[i],nums[j])
        val = num//(den*den)
        return val
    def maxPairStrength(self, nums: list[int]) -> int:
        ans = 0
        n=len(nums)

        for i in range(n):
            for j in range(i+1,n):
                x = self.cal(nums,i,j)
                ans = max(ans,x)
        return ans
        
        
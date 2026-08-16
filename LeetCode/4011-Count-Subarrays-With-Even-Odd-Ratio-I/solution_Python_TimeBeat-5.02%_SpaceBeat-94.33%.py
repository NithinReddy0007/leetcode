class Solution:
    def countRatioSubarrays(self, nums: list[int], a: int, b: int) -> int:

        d={}
        n=len(nums)
        odd = 0
        for i in range(n):
            if nums[i]%2==1:
                odd+=1
            d[i]=odd

        count = 0
        for i in range(n):
            for j in range(i,n):
                lenn = j-i+1
                y = d[j]
                if i!=0:
                    y-=d[i-1]
                x = lenn-y

                if y>0 and x*b <= a*y:
                    count+=1
        return count
                
                
            
        
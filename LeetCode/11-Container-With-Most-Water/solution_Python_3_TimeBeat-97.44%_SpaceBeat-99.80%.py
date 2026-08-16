class Solution:
    def maxArea(self, height: List[int]) -> int:
        area=float('-inf')
        n=len(height)
        i=0
        j=n-1
        while i<j:
            temp=0
            if height[i]>height[j]:
                temp=height[j]*(j-i)
            else:
                temp=height[i]*(j-i)
            if temp>area:
                area=temp
            if height[i]>height[j]:
                j-=1
            else:
                i+=1
        return area

        
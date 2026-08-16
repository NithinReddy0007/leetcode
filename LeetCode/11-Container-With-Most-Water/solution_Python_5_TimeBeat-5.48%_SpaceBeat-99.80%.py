class Solution:
    def maxArea(self, height: List[int]) -> int:
        area=float('-inf')
        n=len(height)
        i=0
        j=n-1
        while i<j:
            temp=min(height[i],height[j])*(j-i)
            area=max(temp,area)
            if height[i]<height[j]:
                i+=1
            else:
                j-=1
        return area

        
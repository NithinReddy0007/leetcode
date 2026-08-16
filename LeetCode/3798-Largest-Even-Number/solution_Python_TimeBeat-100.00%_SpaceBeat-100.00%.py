class Solution:
    def largestEven(self, s: str) -> str:
        if s[-1]=="2":
            return s
        last=0
        count=0
        for i in range(len(s)):
            if s[i]=="2":
                last=i
                count+=1
        return s[:last+1] if count!=0 else ""
            
        
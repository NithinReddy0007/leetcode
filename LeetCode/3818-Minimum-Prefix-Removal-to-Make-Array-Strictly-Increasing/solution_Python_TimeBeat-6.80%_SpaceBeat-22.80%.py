class Solution:
    def minimumPrefixLength(self, a: List[int]) -> int:
        n=len(a)
        idx=0
        for i in range(n-1):
            if a[i]>=a[i+1]:
                idx=i+1
        return idx
            
            
                
        
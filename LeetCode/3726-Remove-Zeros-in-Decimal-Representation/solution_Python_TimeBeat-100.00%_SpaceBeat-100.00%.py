class Solution:
    def removeZeros(self, n: int) -> int:
        n=str(n)
        k=""
        for el in n:
            if el!="0":
                k=k+el
        return int(k)
        
        
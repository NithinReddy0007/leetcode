class Solution:
    def decimalRepresentation(self, n: int) -> List[int]:
        l=len(str(n))
        a=[]
        i=0
        for i in range(l):
            r=n%10
            if r!=0:
                a.insert(0,r*10**i)
            n=n//10
            i+=1
        return a
        
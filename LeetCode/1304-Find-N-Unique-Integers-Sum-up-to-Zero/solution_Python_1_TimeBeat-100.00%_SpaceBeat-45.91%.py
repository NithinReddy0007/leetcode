class Solution(object):
    def sumZero(self, n):
        if n==2:
            return [-1,1]
        a=[]
        for i in range (n-1):
            a.append(i)
        k=sum(a)
        a.append(-k)
        return a

        
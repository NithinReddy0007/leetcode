class Solution(object):
    def myPow(self, x, n):
        if x==0:
            return x
        if n==1:
            return x
        if n==0:
            return 1 
        return x**n

        
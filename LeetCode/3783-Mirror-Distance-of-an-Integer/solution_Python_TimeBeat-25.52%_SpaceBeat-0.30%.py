class Solution(object):
    def mirrorDistance(self, n):
        """
        :type n: int
        :rtype: int
        """
        st=n
        f=0
        while n:
            r=n%10
            f=f*10+r
            n=n//10
        return abs(st-f)
            
        
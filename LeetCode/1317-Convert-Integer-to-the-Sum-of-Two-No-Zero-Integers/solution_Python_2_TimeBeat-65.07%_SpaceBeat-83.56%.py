class Solution(object):
    def getNoZeroIntegers(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        a=1
        b=n-1
        i=1
        while True:
            if "0" in str(a) or "0" in str(b):
                b=n-1-i
                a=1+i
                i+=1
            else:
                return [a,b]
        
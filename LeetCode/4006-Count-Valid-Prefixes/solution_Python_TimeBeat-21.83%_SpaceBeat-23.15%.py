class Solution:
    def check(self,zero,one):
        if zero==1 and one==0:
            return True
        if zero==0 and one==1:
            return True
        if zero==one+1:
            return True
        if zero+1==one:
            return True
        if zero==one:
            return True
        return False
    def countValidPrefixes(self, s: str) -> int:

        zero=0
        one=0
        count = 0
        for el in s:
            if el=='0':
                zero+=1
            else:
                one+=1
            if self.check(zero,one):
                count+=1
        return count
        
class Solution(object):
    def isPalindrome(self, x):
        x=str(x)
        i,j=0,len(x)-1
        while i<len(x)//2:
            if x[i]!=x[j]:
                return False
            i+=1
            j-=1
        return True


        
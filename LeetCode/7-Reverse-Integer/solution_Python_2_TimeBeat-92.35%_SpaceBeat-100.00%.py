class Solution(object):
    def reverse(self, x):
        if x==0:
            return 0
        s=-1 if x<0 else 1
        if x<0:
            x=-x
        x=str(x)[::-1]
        if int(x)<-2**31 or int(x)>2**31-1:
            return 0
        return int(x)*s



        
        
    
        
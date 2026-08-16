class Solution:
    def reverse(self, x: int) -> int:
        sign=1
        if x<0:
            x=-x
            sign=-1
        x=str(x)
        x=x[::-1]
        
        if int(x)*sign>2**31 -1 or int(x)*sign < -(2**31):
            return 0
        return int(x)*sign

        
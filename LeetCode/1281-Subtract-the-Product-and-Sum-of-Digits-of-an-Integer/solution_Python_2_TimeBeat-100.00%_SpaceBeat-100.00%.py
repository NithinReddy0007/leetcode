class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        if len(str(n))==0:
            return 0
        m=n
        p=1
        s=0
        while m!=0:
            p=p*(m%10)
            s=s+m%10
            m=m//10

        return p-s

        
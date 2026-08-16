class Solution:
    def subtractProductAndSum(self, m: int) -> int:
        p=1
        s=0
        while m!=0:
            p=p*(m%10)
            s=s+m%10
            m=m//10

        return p-s

        
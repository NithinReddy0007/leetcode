class Solution:
    def check(self,n):
        count=0
        a=[]
        for i in range(1,int(n**0.5)+1):
            if n%i==0:
                a.append(i)
                a.append(n//i)
                count+=2
            if i*i==n:
                count-=1
            if count>4:
                return False
        if count==4:
            return sum(a)
        else:
            return 0

    def sumFourDivisors(self, nums: List[int]) -> int:
        summ=0
        for el in nums:
            summ+=self.check(el)
        return summ
        
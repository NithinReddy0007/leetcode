class Solution:
    def addDigits(self, num: int) -> int:
        if len(str(num))==1:
            return num
        summ=0
        while True:
            summ=0
            while num>0:
                summ+=num%10
                num=num//10
            if len(str(summ))==1:
                return summ
            num=summ

        
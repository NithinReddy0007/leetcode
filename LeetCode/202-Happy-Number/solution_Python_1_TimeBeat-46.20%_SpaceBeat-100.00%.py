class Solution:
    def isHappy(self, n: int) -> bool:
        n=str(n)
        a=set({})
        summ=0
        while True:
            summ=0
            for el in n:
                summ+=int(el)**2
            if summ==1:
                return True
            if summ in a:
                return False
            a.add(summ)
            n=str(summ)
        
        
        
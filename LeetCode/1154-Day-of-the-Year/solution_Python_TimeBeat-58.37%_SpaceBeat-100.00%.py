class Solution:
    def leap(self,n):
        if n%100==0 and n%400!=0:
            return False
        if n%4==0:
            return True
        return False
    def dayOfYear(self, date: str) -> int:
        y=int(date[:4])
        m=int(date[5:7])
        d=int(date[8:])

        if self.leap(y):
            year=[31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        else:
            year=[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

        summ=0
        for i in range (len(year)):
            if i<m-1:
                summ+=year[i]
        return summ+d
        
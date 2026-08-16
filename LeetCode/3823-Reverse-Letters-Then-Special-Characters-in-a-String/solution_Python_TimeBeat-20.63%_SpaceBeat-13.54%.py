class Solution:
    def reverseByType(self, s: str) -> str:
        c=[]
        a=[]
        for el in s:
            if el.isalpha():
                c.insert(0,el)
            else:
                a.insert(0,el)
        t=""
        i=0
        j=0
        print(c)
        print(a)
        
        for el in s:
            if el.isalpha():
                t=t+c[i]
                i+=1
            else:
                t=t+a[j]
                j+=1
        return t
        
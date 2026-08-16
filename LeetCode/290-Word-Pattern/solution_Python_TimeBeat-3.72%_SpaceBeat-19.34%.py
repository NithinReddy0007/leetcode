class Solution(object):
    def wordPattern(self, pattern, s):

        a=list(pattern)
        
        b = list(map(str,s.split()))

        print(a,b)



        d = {}

        if(len(a)!=len(b)): return False

        n=len(a)

        for i in range(n):
            if a[i] in d:
                if d[a[i]]!=b[i]:
                    return False
            else:
                d[a[i]]=b[i]

        d = {}
        
        for i in range(n):
            if b[i] in d:
                if d[b[i]]!=a[i]:
                    return False
            else:
                d[b[i]]=a[i]


        return True 
        
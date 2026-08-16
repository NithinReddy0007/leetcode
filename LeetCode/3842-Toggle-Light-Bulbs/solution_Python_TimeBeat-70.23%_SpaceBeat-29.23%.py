class Solution:
    def toggleLightBulbs(self, bulbs: list[int]) -> list[int]:
        d={}

        n = len(bulbs)
        for el in bulbs:
            if el not in d:
                d[el]=1
            else:
                d[el]+=1
        a=[]
        for el in d:
            if d[el]%2!=0:
                a.append(el)
        a.sort()
        return a
        
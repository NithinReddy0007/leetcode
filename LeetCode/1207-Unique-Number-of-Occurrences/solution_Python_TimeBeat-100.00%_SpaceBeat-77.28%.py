class Solution:
    def uniqueOccurrences(self, nums: List[int]) -> bool:
        d={}
        s=set({})

        for el in nums:
            if el not in d:
                d[el]=1
            else:
                d[el]+=1
        for el in d:
            s.add(d[el])
        
        return len(s)==len(d)
        
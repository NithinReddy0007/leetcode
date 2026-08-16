class Solution(object):
    def minCost(self, s, cost):
        """
        :type s: str
        :type cost: List[int]
        :rtype: int
        """
        d={}
        for i in range(len(s)):
            if s[i] not in d:
                d[s[i]]=[i]
            else:
                d[s[i]].append(i)
        total=sum(cost)
        minn=total
        for el in d:
            t=d[el]
            summ=0
            for j in range(len(t)):
                summ+=cost[t[j]]
            minn=min(minn,total-summ)
        return minn
                
                
        
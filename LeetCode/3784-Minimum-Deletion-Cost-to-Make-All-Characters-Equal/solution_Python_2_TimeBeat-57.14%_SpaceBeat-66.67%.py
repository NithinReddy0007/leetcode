class Solution(object):
    def minCost(self, s, cost):

        d={}
        for i in range(len(s)):
            if s[i] not in d:
                d[s[i]]=0+cost[i]
            else:
                d[s[i]]+=cost[i]
        total=sum(cost)
        minn=total
        for el in d:
            summ=d[el]
            minn=min(minn,total-summ)
        return minn
                
                
        
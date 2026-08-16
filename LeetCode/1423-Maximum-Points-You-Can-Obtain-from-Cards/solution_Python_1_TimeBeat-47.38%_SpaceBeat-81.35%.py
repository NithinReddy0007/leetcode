class Solution(object):
    def maxScore(self, a, k):
        n=len(a)
        lsum=0
        for i in range(k):
            lsum+=a[i]
        max_sum=lsum
        r=n-1
        rsum=0
        for i in range(k-1,-1,-1):
            lsum=lsum-a[i]
            rsum=rsum+a[r]
            r-=1
            max_sum=max(max_sum,rsum+lsum)
        return max_sum
                
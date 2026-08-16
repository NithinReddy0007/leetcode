class Solution(object):
    def maxScore(self, a, k):
        n=len(a)
        lsum=0
        for i in range(k):
            lsum+=a[i]
        max_sum=lsum
        rsum=0
        for i in range(1,k+1):
            lsum=lsum-a[k-i]
            rsum=rsum+a[n-i]
            max_sum=max(max_sum,rsum+lsum)
        return max_sum
                
class Solution:
    def countMonobit(self, n: int) -> int:
        count=0
        i=0
        while 2**i-1<=n:
            count+=1
            i+=1
        return count
        
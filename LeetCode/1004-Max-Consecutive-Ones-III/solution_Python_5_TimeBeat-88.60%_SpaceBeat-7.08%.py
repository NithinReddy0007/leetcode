class Solution(object):
    def longestOnes(self, nums, k):
        n = len(nums)
        i = 0
        zero = 0
        best = 0

        # Local references for speed
        arr = nums
        kk = k

        for j in range(n):
            if arr[j] == 0:
                zero += 1

            while zero > kk:
                if arr[i] == 0:
                    zero -= 1
                i += 1

            # Inline max to avoid function call
            curr = j - i + 1
            if curr > best:
                best = curr

        return best

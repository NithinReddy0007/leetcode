class Solution:
    def minLength(self, nums: List[int], k: int) -> int:
        freq = {}
        distinct_sum = 0
        min_len = len(nums) + 1

        i = 0
        for j in range(len(nums)):
            x = nums[j]

            freq[x] = freq.get(x, 0) + 1
            if freq[x] == 1:
                distinct_sum += x

            while distinct_sum >= k:
                min_len = min(min_len, j - i + 1)

                left = nums[i]
                freq[left] -= 1
                if freq[left] == 0:
                    distinct_sum -= left
                    del freq[left]
                i += 1

        return min_len if min_len != len(nums) + 1 else -1

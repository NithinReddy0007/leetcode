class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        temp=[]
        temp=[i for i in nums if i not in temp]
        temp.sort(reverse=True)
        return temp[k-1]
        
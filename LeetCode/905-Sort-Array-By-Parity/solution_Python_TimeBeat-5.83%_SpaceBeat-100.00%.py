class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        a=[]
        for el in nums:
            if el%2==0:
                a.insert(0,el)
            else:
                a.append(el)
        return a
        
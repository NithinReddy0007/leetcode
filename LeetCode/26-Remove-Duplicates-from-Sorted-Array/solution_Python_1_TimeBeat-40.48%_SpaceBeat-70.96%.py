class Solution(object):
    def removeDuplicates(self, a):
        """
        :type nums: List[int]
        :rtype: int
        """
        j=0
        for i in range(len(a)):
            if a[i]!=a[j]:
                j+=1
                a[j]=a[i]

        return j+1
        
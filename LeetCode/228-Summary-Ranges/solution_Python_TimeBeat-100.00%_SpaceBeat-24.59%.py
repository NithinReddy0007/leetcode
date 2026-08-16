class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        count=0
        a=[]
        n=len(nums)
        s=set(nums)
        i=0
        while i<n:
            temp=nums[i]
            count=0
            if temp-1 in s:
                i+=1
                continue
            while temp+1 in s:
                count+=1
                temp+=1
            if count>0:
                a.append(str(nums[i])+"->"+str(temp))
            else:
                a.append(str(nums[i]))
            i+=1
        return a
            
        
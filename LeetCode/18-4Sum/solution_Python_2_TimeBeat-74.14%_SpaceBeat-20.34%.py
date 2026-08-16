class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        n=len(nums)
        nums.sort()
        ans=[]
        st=set({})
        for i in range(n):
            if i>0 and nums[i]==nums[i-1]:
                continue
            else:
                for j in range(i+1,n):
                    if j>i+1 and nums[j]==nums[j-1]:
                        continue
                    else:
                        k=j+1
                        l=n-1
                        while k<l:
                            summ=nums[i]+nums[j]+nums[k]+nums[l]
                            if summ<target:
                                k+=1
                            elif summ>target:
                                l-=1
                            else:
                                temp=[nums[i],nums[j],nums[k],nums[l]]
                                temp.sort()
                                if tuple(temp) not in st:
                                    st.add(tuple(temp))
                                    ans.append(temp)
                                k+=1
                                while k<l and nums[k]==nums[k-1]:
                                    k+=1
                                l-=1
                                while k<l and nums[l]==nums[l+1]:
                                    l-=1
        return ans                            

        
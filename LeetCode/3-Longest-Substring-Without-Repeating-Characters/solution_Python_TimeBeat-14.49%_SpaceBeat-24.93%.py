class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n=len(s)
        max_len=0
        if n==0 or n==1:
            return n
        r=0
        l=0
        st=set({})
        while r<n:
            while s[r] in st:
                st.discard(s[l])
                l+=1
            st.add(s[r])
            max_len=max(max_len,r-l+1)
            r+=1
        return max_len

        
        
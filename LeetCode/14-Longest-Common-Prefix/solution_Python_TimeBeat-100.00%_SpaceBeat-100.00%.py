class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()
        a=strs[0]
        b=strs[-1]
        k=""
        for i in range (min(len(a),len(b))):
            if a[i]==b[i]:
                k=k+a[i]
            else:
                break
        if len(k)==0:
            return ""
        else:
            return k
        
        
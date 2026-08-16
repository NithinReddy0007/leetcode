class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        r=""
        for i in range(k):
            r=s[i]+r
        return r+s[k:]
        
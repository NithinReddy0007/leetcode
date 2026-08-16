class Solution:
    def trimTrailingVowels(self, s: str) -> str:
        ans=list(s)
        for i in range(len(s)-1,-1,-1):
            if s[i] in "aeiou":
                ans[i]=""
            else:
                break
        return "".join(ans)
        
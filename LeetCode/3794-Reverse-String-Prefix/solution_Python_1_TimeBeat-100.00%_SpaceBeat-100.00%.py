class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        chars = []
        for ch in s:
            chars.append(ch)

        i = 0
        j = k - 1

        while i < j:
            temp = chars[i]
            chars[i] = chars[j]
            chars[j] = temp
            i = i + 1
            j = j - 1

        result = ""
        for ch in chars:
            result = result + ch

        return result
        
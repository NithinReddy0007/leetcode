class Solution:
    def bitwiseComplement(self, n: int) -> int:
        s=bin(n)[2:]
        t=""
        for el in s:
            if el=="0":
                t+="1"
            else:
                t+="0"
        return int(t,2)


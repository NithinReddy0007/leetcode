class Solution:
    def myAtoi(self, s: str) -> int:
        k=""
        s=s.strip()
        
        # for el in s:
        #     if el=="0" and t==""
        for el in s:
            if el == "-" or el == "+":
                if k == "":
                    k += el
                else:
                    break
            elif el.isdigit():
                k += el
            else:
                break
    
        val = int(k) if k not in ("", "+", "-") else 0
        return max(-2**31, min(val, 2**31 - 1))


        
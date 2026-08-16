class Solution:
    def defangIPaddr(self, address: str) -> str:
        address=list(map(str,address.split(".")))
        k=""
        for i in range (len(address)):
            if i!=len(address)-1:
                k=k+address[i]+"[.]"
            else:
                k=k+address[i]
        return k

        
class Solution:
    def sorty(self,s):
        si=list(s)
        si.sort()
        return "".join(si)
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict1={}
        for el in strs:
            key=self.sorty(el)
            if key in dict1:
                dict1[key].append(el)
            else:
                dict1[key]=[el]
        return list(dict1.values())

        
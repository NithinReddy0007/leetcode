class Solution:
    def rec(self,n,temp,i,ans,d,s):
        if len(temp)==n:
            ans.append(temp)
            return
        for el in d[s[i]]:
            self.rec(n,temp+el,i+1,ans,d,s)
        
        
    def letterCombinations(self, s: str) -> List[str]:
        d = {
            "2": ['a','b','c'],
            "3": ['d','e','f'],
            "4": ['g','h','i'],
            "5": ['j','k','l'],
            "6": ['m','n','o'],
            "7": ['p','q','r','s'],
            "8": ['t','u','v'],
            "9": ['w','x','y','z']
        }
        n=len(s)

        ans=[]
        self.rec(n,"",0,ans,d,s)
        return ans


        



        

        



        



        



                
                
        
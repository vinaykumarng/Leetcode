class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False

        sets = list(s)
        sett = list(t)

        print(sorted(s))

        if(sorted(s) == sorted(t)):
            return True

        return False

        
        
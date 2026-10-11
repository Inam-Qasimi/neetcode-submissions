class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # A space efficent solution would be a sliding window, we begin with two pointers
        # left and right and a set s, left and right start at 0 and add then add char into set right increments only when the
        # character at right is not in s, after doing so, and at each step calculating some max. Then we set l = r and repeat
        # while emptying the set

        l = 0
        best = 0
        window = set()
        for r, char in enumerate(s):
            while char in window:
                window.remove(s[l])
                l += 1
            window.add(char)
            best = max(best, r - l + 1)
        
        return best
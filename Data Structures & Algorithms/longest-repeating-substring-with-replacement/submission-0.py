class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        # Naive solution: Anchor on the most frequent letter, then try all the possibilities of
        # k letter with the majority letter and then returning the max of that using a sliding
        # window

        # Use a frequency table to count how many times a certain character appears
        # Then use a sliding window approach with a length number of times the majority
        # letter appears + k or window length - majority letter <= k
        counts = {}
        freq = 0
        left = 0
        best = 0
        
        for right, char in enumerate(s):
            counts[char] = counts.get(char, 0) + 1
            freq = max(freq, counts[char])
            while (right - left + 1) - freq > k:
                counts[s[left]] -= 1
                left += 1
            best = max(best, right - left + 1)

        return best
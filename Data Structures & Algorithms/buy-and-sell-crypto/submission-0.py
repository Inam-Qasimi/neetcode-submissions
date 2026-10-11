class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # Brute Force Solution -> Anchor on a day to buy and check all future days to sell
        # where profit = (sell - buy) and where max = 0

        best = 0
        buy = 0
        for sell in range(1, len(prices)):
            best = max(best, prices[sell] - prices[buy])
            if (prices[sell] < prices[buy]):
                buy = sell
        return best
        
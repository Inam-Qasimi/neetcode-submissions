class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length <= 1)
        {
            return null;
        }
        else if (numbers.length == 2)
        {
            return new int[]{1, 2};
        }

        int l = 0;
        int r = 1;
        while (numbers[l] + numbers[r] != target)
        {
            if (numbers[l] + numbers[r] < target)
            {
                l += 1;
                r += 1;
            }
            else if (numbers[l] + numbers[r] > target)
            {
                l -= 1;
            }
        }
        return new int[]{l + 1, r + 1};
    }
}
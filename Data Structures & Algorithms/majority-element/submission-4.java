class Solution {
    public int majorityElement(int[] nums)
    {
        int curr = nums[0];
        int currF = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (curr == nums[i])
            {
                currF += 1;
            }
            else if (currF == 1)
            {
                curr = nums[i];
            }
            else
            {
                currF -= 1;
            }
        }
        return curr;
    }
}
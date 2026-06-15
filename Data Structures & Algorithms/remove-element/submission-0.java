class Solution {
    public int removeElement(int[] nums, int val)
    {
        int i = 0;
        int k = nums.length;
        while (i < k)
        {
            if (nums[i] == val)
            {
                nums[i] = nums[--k];
            }
            else
            {
                i++;
            }
        }
        return k;
    }
}
class Solution {
    public int majorityElement(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Integer maxKey = 0;
        int half = nums.length / 2;
        int maxF = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            Integer key = Integer.valueOf(nums[i]);
            if (map.containsKey(key))
            {
                map.put(key, map.get(key) + 1);
            }
            else
            {
                map.put(key, 1);
            }
            if (map.get(key) > maxF)
            {
                    maxKey = key;
                    maxF = map.get(key);
            }
        }
        return maxKey;
    }
}
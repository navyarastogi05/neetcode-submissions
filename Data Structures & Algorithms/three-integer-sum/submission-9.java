class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Set<List<Integer>> c = new HashSet<>();

        HashMap <Integer, Integer> count = new HashMap<>();
        for (int i= 0; i<nums.length;i++)
        {
            count.put(nums[i], i);
        }
        int n =0;
        for(int i= 0; i<nums.length;i++)
        {
                 n = -1*nums[i];
 
            for(int j = i+1;j<nums.length ; j++)
            {
                int diff = n- nums[j];
                if (count.get(diff)!=null && count.get(diff) > j)
                {
                    int min = Math.min(Math.min(diff, nums[j]),nums[i]);
                    int max=Math.max(Math.max(diff, nums[j]),nums[i]);
                    int other = -min-max;
                    c.add(Arrays.asList(min, other, max));
                }
            }
        }
        List<List<Integer>> c1 = new ArrayList<>(c);
        return c1;
    }
}

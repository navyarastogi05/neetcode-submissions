class Solution {
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> num = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            num.put(nums[i], (num.getOrDefault(nums[i],0))+1);
        }
        for(int i = 0;i<nums.length;i++)
        {
            if (num.get(nums[i])>=nums.length/2)
            {
                return nums[i];
            }
        }
        return 0;
    }
}
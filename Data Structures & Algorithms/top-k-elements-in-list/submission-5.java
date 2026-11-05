class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap <Integer, Integer> c= new HashMap<>();
        for(int i = 0; i<nums.length;i++)
        {
            c.put(nums[i], (c.getOrDefault(nums[i],0)+1));
        }
       List<Integer>[] bucket = new List[nums.length+1];

        for (int key : c.keySet()) 
        {
            int frequency= c.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] result = new int[k];
        int counter = 0;
        
        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[counter++] = num;
                    if (counter == k) {
                        return result;
                    }
                }
            }
        }
        
        return result;
    }
}

class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int[] arr = new int[nums.length];
        int k = 1;
        int j=nums.length-1;
        for(int i=0; i<nums.length;i++)
        {
                       
                arr[i]=k; // 1 1 2 8
                k=k*nums[i];  //1 1 2 8   
        }
        k=1;
        for(int i = nums.length-1; i>=0;i--)
        {
            arr[i]=arr[i]*k;
            k= k*nums[i];
        }
        return arr;
    }
}

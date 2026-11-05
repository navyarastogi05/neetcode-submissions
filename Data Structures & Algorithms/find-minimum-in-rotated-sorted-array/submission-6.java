class Solution 
{
    public int findMin(int[] nums) 
    {
        int l = 0 ;
        int r = nums.length-1;
        int mid = l+(r-l)/2;
        int ans= nums[0];

        while(l<=r)
        {
            if (nums[l]<=nums[r])
            {
                ans = nums[l];
                break;
            }
            else
            {
                mid = l+(r-l)/2;
                if (nums[mid]>=nums[l])
                {
                    l++;
                }
                else if (nums[mid]<nums[r])
                {
                    r--;
                }
                else
                {
                    ans= nums[mid];
                    break;
                }
            }
        }
        return ans;
    }
}

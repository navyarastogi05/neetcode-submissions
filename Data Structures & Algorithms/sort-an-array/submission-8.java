class Solution 
{
    public int[] sortArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;
       
        int arr[]= mergeSort(nums , start, end);
        return arr;
    }
    public int[] mergeSort(int[] nums, int start, int end)
    {
        if (start<end)
        {
            int mid= start +(end-start)/2;
            mergeSort(nums,start, mid);//left 
            mergeSort(nums,mid+1,end);//right
            merge (nums, start, mid, end);

        }
        return nums;
    }
    public void merge(int[] nums, int start, int mid, int end)
    {
        int temp[]= new int[end - start + 1];
        int i =start;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=end)
        {
            if (nums[i]<nums[j])
            {
                temp[k]=nums[i];
                i++;
            }
            else
            {
                temp[k]=nums[j];
                j++;
            }
            k++;
        } 
        while (i<=mid)
        {
            temp[k]=nums[i];
            i++;
            k++;
        }
        while (j<=end)
        {
            temp[k]=nums[j];
            j++;
            k++;
        }
       for (int x = 0; x < temp.length; x++) 
       {
        nums[start + x] = temp[x];
    }
}
}
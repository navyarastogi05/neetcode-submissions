class Solution 
{
    public int maxArea(int[] heights) 
    {
        int  l = 0;
        int r= heights.length-1;//7
        int area= (r-l)*(Math.min(heights[l],heights[r]));//8
        int max=0;
        while(l<r)
        {   
            area= (r-l)*(Math.min(heights[l],heights[r]));    
            max= Math.max(max,area);        
            if (heights[l]<=heights[r])
            l++;
            else
            r--;               
        }
        return max;
    }
}

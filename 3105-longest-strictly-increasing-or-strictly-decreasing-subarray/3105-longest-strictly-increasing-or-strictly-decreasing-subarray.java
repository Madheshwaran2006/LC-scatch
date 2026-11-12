class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int max = 1;
        int u = 1;
        int d = 1;
        for(int i=1; i<n; i++)
        {
            if(nums[i]>nums[i-1])
            {
                u++;
                d=1;
            }else if(nums[i]<nums[i-1])
            {
                d++;
                u=1;
            }else{
                d=1;
                u=1;
            }
            max = Math.max(u,Math.max(d,max));
        }
        return max;
        
    }
}
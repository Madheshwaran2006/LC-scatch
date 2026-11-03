class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int mxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            mxi = Math.max(mxi,nums[i]);
        }
        int mov = 0;
        for(int num:nums)
        {
            mov+=Math.abs(num-mxi);
        }
        return mov;
        
    }
}
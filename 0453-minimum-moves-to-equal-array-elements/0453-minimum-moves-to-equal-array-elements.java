class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            mini = Math.min(mini,nums[i]);
        }
        int moves = 0;
        for(int num:nums)
        {
            moves+=num-mini;
        }
        return moves;
    }
}
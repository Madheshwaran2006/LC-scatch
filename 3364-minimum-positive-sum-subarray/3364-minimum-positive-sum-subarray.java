class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int mini = Integer.MAX_VALUE;
        int n = nums.size();
        
        for(int i=0; i<n; i++)
        {
            int sum = 0;
            for(int j=i; j<n; j++)
            {
                sum+=nums.get(j);
                if(sum>0 && l<=j-i+1 &&j-i+1<=r)
                {
                    mini = Math.min(mini,sum);
                }
            }
        }
        return mini == Integer.MAX_VALUE?-1:mini;
        
    }
}
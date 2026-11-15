class Solution {
    public int numOfSubarrays(int[] arr) {
        long mod = 1000000007;
        int n = arr.length;
        long[] pre = new long[n+1];
        pre[0] = 0;
        for(int i=0; i<n; i++)
        {
            pre[i+1] = pre[i]+arr[i];
        }
        long even = 1;
        long odd = 0;
        long ans = 0;
        for(int i=1; i<pre.length; i++)
        {
            if(pre[i]%2 == 0)
            {
                even++;
                ans = (ans+odd)%mod;
            }else{
                odd++;
                ans = (ans + even)%mod;
            }
        }
        return (int)ans;
        
    }
}
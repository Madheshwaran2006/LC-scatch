class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] res = new int[n];
        int c = 0;
        for(int i=0; i<n; i++)
        {
            if(seq.charAt(i) == '(')
            {
                res[i] = c%2;
                c++;
            }else if(seq.charAt(i) == ')'){
                c--;
                res[i] = c%2;
            }
        }
        return res;
    }
}
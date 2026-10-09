class Solution {
    public int minInsertions(String s) {
        int cnt =0;
        int depth = 0;
        for(char ch:s.toCharArray()){
            if(ch == '(')
            {
                
                if(depth%2 ==1)
                {
                    cnt++;
                    depth--;
                }
                depth+=2;
            }else{
                depth--;
                if(depth == -1)
                {
                    cnt++;
                    depth=1;
                }
            }
        }
        return cnt+depth;
    }
}
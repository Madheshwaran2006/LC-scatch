class Solution {
    public boolean hasValidPath(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        if((m+n-1)%2!=0) return false;

        if(grid[0][0] == ')') return false;

        Queue<int[]> q = new LinkedList<>();
        boolean[][][] vis = new boolean[n][m][n+m];
        int[] dr = {0,1};
        int[] dc = {1,0};
        q.offer(new int[]{0,0,1});
        vis[0][0][1] = true;
        while(!q.isEmpty())
        {
            int row = q.peek()[0];
            int col = q.peek()[1];
            int bal = q.peek()[2];
            q.remove();

            if(row == n-1&&col == m-1)
            {
                if(bal == 0)
                {
                    return true;
                }

            }
            for(int i=0; i<2; i++)
            {
                int nr = dr[i]+row;
                int nc = dc[i]+col;

                if(nr>=n||nc>=m) continue;

                int newbal = bal;

                if(grid[nr][nc] == '(')
                {
                    newbal++;
                }else
                {
                    newbal--;
                }

                if(newbal<0) continue;
                if(vis[nr][nc][newbal]) continue;
                vis[nr][nc][newbal] = true;
                q.offer(new int[]{nr,nc,newbal});

            }

        }
        return false;

        
    }
}
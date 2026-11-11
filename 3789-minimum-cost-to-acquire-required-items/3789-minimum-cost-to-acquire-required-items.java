class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long v1 = (long) Math.max(need1,need2)*costBoth;
        long v2 = (long) need1*cost1 + (long)need2*cost2;
        long  common = Math.min(need1,need2);
        long v3 = common*costBoth +(long) (need1 - common)*cost1 +(long) (need2 - common)*cost2;
        return Math.min(v1,Math.min(v2,v3));
        
    }
}
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int r=piles[piles.length-1];
        int res=r;
        int l=1;
        while(l<=r)
        {
            int k=(l+r)/2;
            int time = 0;
            for(int p:piles)
            {
                time+=Math.ceil((double)p/k);
            }
            if(time<=h)
            {
                res=k;
                r=k-1;
            }
            else l=k+1;
        }
        return res;
    }
}

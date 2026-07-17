class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(int num:nums)
            unique.add(num);
        int res=0;
        for(int num : nums)
        {
            int streak=0, curr=num;
            while(unique.contains(curr))
            {
                streak++;
                curr++;
            }
             res=Math.max(res,streak);
        }
        return res;
    }
}

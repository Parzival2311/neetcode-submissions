class Solution {
    public int b_search(int l, int r, int[] nums, int target) {
        if(l>r) return -1;
        int m= l+(r-1/2);
        if(nums[m]==target) return m;
        return (nums[m]<target) ? 
            b_search(m+1,r,nums,target) : 
            b_search(l,r-1,nums,target);
    }
    public int search(int[] nums, int target)
    {
        return b_search(0,nums.length-1,nums,target);
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for(int num : nums)
            unique.add(num);
        int longest=0;
        for(int num : unique)
        {
            if(!unique.contains(num-1))
            {
                int length=1;
                while(unique.contains(num+length))
                {
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}

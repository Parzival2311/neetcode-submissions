class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> indices = new HashMap<>();
        int comp=0;
        for(int i=0; i<nums.length;i++)
        {
            indices.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            comp=target-nums[i];
            if(indices.containsKey(comp) && indices.get(comp) != i)
                return new int[]{i, indices.get(comp)};
        }
        return new int[0];
    }
}

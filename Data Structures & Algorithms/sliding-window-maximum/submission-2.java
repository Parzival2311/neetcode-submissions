class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n-k+1];
        Deque<Integer> q = new LinkedList<>();
        for(int i=0;i< k; i++)
        {
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i])
            {
                q.pollLast();
            }
            q.offerLast(i);
        }
        output[0]=nums[q.peekFirst()];
        for(int i=k; i<n; i++)
        {
            if(q.peekFirst()<=i-k)
                q.pollFirst();
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i])
            {
                q.pollLast();
            }
            q.offerLast(i);
            output[i-k+1]=nums[q.peekFirst()];
        }
        return output;
    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<=n; i++)
        {
            while(!stack.isEmpty() && (i==n || heights[i]<=heights[stack.peek()]))
            {
                int h = heights[stack.pop()];
                int width = stack.isEmpty() ? i : (i-stack.peek()-1);
                maxArea = Math.max(h*width, maxArea);
            }
            stack.push(i);
        }
        return maxArea;
    }
}

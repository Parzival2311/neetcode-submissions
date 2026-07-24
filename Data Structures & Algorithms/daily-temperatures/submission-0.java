class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> values = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];
        for(int i=n-1; i>=0 ; i--)
        {
            while(!values.isEmpty() && temperatures[i]>=temperatures[values.peek()])
            {
                values.pop();
            }
            if(!values.isEmpty())
            {
                res[i]=values.peek() - i;
            }
            values.push(i);
        }
        return res;
    }
}

// Day 192 : House robber

class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        for (int x : nums) {
            int temp = Math.max(prev1, prev2 + x);
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }
}

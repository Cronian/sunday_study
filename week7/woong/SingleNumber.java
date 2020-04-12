class Solution {
    public int singleNumber(int[] nums) {
        int bit = 0;
        for(int val : nums) {
            bit = bit^val;
        }
        return bit;
    }
}

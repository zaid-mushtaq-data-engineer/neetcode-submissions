class Solution {
    public int[] getConcatenation(int[] nums) {

        int size = nums.length;
        int[] ans = new int[size * 2];
        for(int i = 0; i<nums.length; i++){
            ans[i] = ans[i+ size] = nums[i];

        }
        return ans;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int counter = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter > n / 2) {
                return nums[i];
            }
        }

        return nums[0];
    }
}
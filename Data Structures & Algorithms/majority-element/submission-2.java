class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        int size = nums.length - 1;
        if (size == 1) {
            return nums[0];
        }
        int counter = 1;
        int number = nums[0];

        for (int i = 1; i <= size; i++) {
            if (nums[i] == nums[i - 1]) {
                counter++;
            } else {
                if (counter > size / 2) {
                    return nums[i - 1];
                } else {
                    counter = 1;
                    number = nums[i];
                }
            }

            
        }
        return number;
    }
}
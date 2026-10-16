class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            while (left <= right && nums[right] == val) {
                right--;
            }
            if(right < left ){
                return left;
            }

            if (left <= right && nums[left] == val) {
                swap(nums, left, right);
                right--;
            } else {
                left++;
            }
        }
    return left;
        
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
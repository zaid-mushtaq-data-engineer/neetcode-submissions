class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0;i < nums.length; i++){
            numbers.add(nums[i]);
        }
        if(numbers.size()!=nums.length)
        {
            return true;
        }
        return false;
    }
}
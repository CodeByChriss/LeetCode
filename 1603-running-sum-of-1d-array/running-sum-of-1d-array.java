class Solution {
    public int[] runningSum(int[] nums) {
        int []dev = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            dev[i]=nums[i] + (i == 0 ? 0 : dev[i-1]);
        }
        return dev;
    }
}
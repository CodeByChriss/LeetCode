class Solution {
    public int searchInsert(int[] nums, int target) {
        int position=0;
        boolean finish=false;

        for(int i = 0; i<nums.length && !finish ; i++){
            if(target < nums[i] || target == nums[i]){
                position = i;
                finish=true;
            }else if(i == nums.length -1){
                position = nums.length;
            }
        }

        return position;
    }
}
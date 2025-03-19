class Solution {
    public int minOperations(int[] nums) {
        if(nums.length >= 3 && nums.length <= Math.pow(10, 5)){
            int cnt=0;
            
            for(int i = 0; i<nums.length-2; i++){
                if(nums[i] != 1){
                    nums[i] = nums[i] == 1 ? 0 : 1;
                    nums[i+1] = nums[i+1] == 1 ? 0 : 1;
                    nums[i+2] = nums[i+2] == 1 ? 0 : 1;
                    cnt++;
                }
            }

            // check if all numbers are one
            for(int j = 0; j<nums.length; j++){
                if(nums[j] != 1)
                    break;
                else if(j == nums.length-1)
                    return cnt;
            }
        }
        return -1;
    }
}
class Solution {
    public int minimumOperations(int[] nums) {
        int []other;
        int cnt=0, len=0;
        while(!differents(nums)){
            len = nums.length-3;
            if(len < 0)
                len = 0;

            other = new int[len];
            for(int i = 0; i<other.length;i++){
                other[i]=nums[i+3];
            }
            
            nums = other;
            cnt++;
        }
        return cnt;
    }

    public static boolean differents(int []nums){
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j])
                    return false;
            }
        }
        return true;
    }
}
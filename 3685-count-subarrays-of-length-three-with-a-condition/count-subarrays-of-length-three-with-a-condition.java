class Solution {
    public int countSubarrays(int[] nums) {
        int cnt=0;
        int a, b, c;
        for(int i = 0; i<nums.length-2; i++){
            a = nums[i];
            b = nums[i+1];
            c = nums[i+2];

            if(a+c==b/2f)
                cnt++;
        }

        return cnt;
    }
}
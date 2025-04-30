class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int a : nums){
            if(String.valueOf(a).length() % 2 == 0)
                cnt++;
        }
        return cnt;
    }
}
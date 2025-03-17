class Solution {
    public boolean divideArray(int[] nums) {
        int num;
        boolean encontrado = false;

        for(int i = 0; i<nums.length; i++){
            num = nums[i];
            encontrado = false;
            for(int j = 0; j<nums.length; j++){
                if( j != i && num == nums[j]){
                    encontrado = true;
                    nums[i] = nums[j] = -1;
                    break;
                }
            }
            if(!encontrado)
                return false;
        }

        return true;
    }
}
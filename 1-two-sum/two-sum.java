class Solution {
    public int[] twoSum(int[] nums, int target) {
        int solucion[];
        boolean finded = false;

        solucion = new int[2];

        for (int i = 0; i < nums.length && !finded; i++) {
            for (int j = 0; j < nums.length && !finded; j++) {
                if ( nums[i]+nums[j] == target && i != j) {
                    solucion[0] = i;
                    solucion[1] = j;
                    finded = true;
                }
            }
        }

        return solucion;
    }
}
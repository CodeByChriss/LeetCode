class Solution {
    public long maximumTripletValue(int[] nums) {
        if (nums.length < 3 || nums.length > Math.pow(10, 5)) {
            return 0;
        }
        
        long maxValue = 0;
        int maxSoFar = nums[0];  // Máximo valor visto hasta ahora
        int maxDiff = 0;  // Máxima diferencia nums[i] - nums[j] vista hasta ahora
        
        for (int k = 1; k < nums.length; k++) {
            // Para cada k, calculamos el valor con la máxima diferencia anterior
            maxValue = Math.max(maxValue, (long) maxDiff * nums[k]);
            // Actualizamos la máxima diferencia usando el máximo anterior y el elemento actual
            maxDiff = Math.max(maxDiff, maxSoFar - nums[k]);
            // Actualizamos el máximo valor visto hasta ahora
            maxSoFar = Math.max(maxSoFar, nums[k]);
        }
        
        return maxValue < 0 ? 0 : maxValue;
    }
}
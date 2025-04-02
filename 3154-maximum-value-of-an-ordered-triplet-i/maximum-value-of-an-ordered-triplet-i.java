class Solution {
    public long maximumTripletValue(int[] nums) {
        ArrayList<Long> results = new ArrayList<Long>();
        
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    results.add((nums[i] - nums[j]) * (nums[k] * 1L));
                }
            }
        }

        return getMax(results);
    }

    public static long getMax(ArrayList<Long> results){
        long max = 0;
        for(int i = 0; i<results.size(); i++){
            if(results.get(i) > max)
                max = results.get(i);
        }
        return max;
    }
}
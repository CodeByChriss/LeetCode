class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 0, right = getMax(ranks) * cars * cars, mid, cnt;

        while(left < right){
            mid = left + (right - left) / 2;
            cnt = 0;

            for(int i = 0; i<ranks.length; i++){
                cnt += (long) Math.sqrt(mid / ranks[i]);
            }

            if(cnt >= cars)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    public static long getMax(int[] ranks){
        long max = (long) ranks[0];

        for(int i = 1; i<ranks.length; i++){
            if(max < ranks[i])
                max = ranks[i];
        }

        return max;
    }
}
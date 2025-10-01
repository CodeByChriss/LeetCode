class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int cnt=numBottles;
        while(numBottles >= numExchange){
            numBottles-=numExchange;
            cnt++;
            numBottles++;
        }
        return cnt;
    }
}
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0, p1=0, p2=0, mid=0;
        for(;low<=high;low++){
            if(String.valueOf(low).length() % 2 == 0){
                mid = String.valueOf(low).length() / 2;
                p1=p2=0;
                for(int i = 0; i<mid; i++){
                    p1 += String.valueOf(low).charAt(i);
                    p2 += String.valueOf(low).charAt(mid+i);
                }
                if(p1 == p2)
                    cnt++;
            }
        }
        return cnt;
    }
}
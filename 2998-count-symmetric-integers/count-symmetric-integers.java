class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0, p1=0, p2=0, mid=0;
        String l = "";
        for(;low<=high;low++){
            l = String.valueOf(low);
            if(l.length() % 2 == 0){
                mid = l.length() / 2;
                p1=p2=0;
                for(int i = 0; i<mid; i++){
                    p1 += l.charAt(i);
                    p2 += l.charAt(mid+i);
                }
                if(p1 == p2)
                    cnt++;
            }
        }
        return cnt;
    }
}
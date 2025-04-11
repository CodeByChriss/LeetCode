class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        for(;low<=high;low++){
            if(String.valueOf(low).length() % 2 == 0){
                int mid = String.valueOf(low).length() / 2;
                int p1=0, p2=0;
                p1 = getNumbers(String.valueOf(low), 0, mid);
                p2 = getNumbers(String.valueOf(low), mid, mid);
                if(p1 == p2){
                    cnt++;
                    System.out.println("yes -> "+p1+" = "+p2);
                }else{System.out.println("no -> "+p1+" = "+p2);}
            }
        }
        return cnt;
    }

    public static int getNumbers(String low, int add, int mid){
        int p=0;
        for(int i = 0; i<mid; i++){
            p += Integer.parseInt(String.valueOf(low.charAt(add+i)));
        }
        return p;
    }
}
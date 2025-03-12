class Solution {
    public int lengthOfLastWord(String s) {
        int cnt=0;
        boolean space = true;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                space = true;
            }else{
                if(space){
                    cnt=0;
                    space = false;
                }

                cnt++;
            }
        }

        return cnt;
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        String word="";
        boolean space = true;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                space = true;
            }else{
                if(space){
                    word = "";
                    space = false;
                }

                word+=s.charAt(i);
            }
        }

        return word.length();
    }
}
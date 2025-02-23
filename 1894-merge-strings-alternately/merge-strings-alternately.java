class Solution {
    public String mergeAlternately(String word1, String word2) {

        String devolver = "";
        int mayor= word1.length() > word2.length() ? word1.length() : word2.length();
        int f=0,k=0;

        for(int i = 0; i<mayor*2;i++){
            if(i == 0 || i % 2 == 0 || k >= word2.length()){
                if(f< word1.length()){
                    devolver += word1.charAt(f);
                    f++;
                }
            }else{
                if(k < word2.length()){
                    devolver += word2.charAt(k);
                    k++;
                }
            }
        }

        return devolver;
    }
}
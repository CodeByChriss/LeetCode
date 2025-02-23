class Solution {
    public String reverseVowels(String s) {
        ArrayList<Integer> posicion = new ArrayList<Integer>();
        String devolver = "";
        int j;
        char c1, c2;

        for(int i = 0; i<s.length(); i++){
            c1 = s.charAt(i);
            if(
                c1 == 'A' ||
                c1 == 'E' ||
                c1 == 'I' ||
                c1 == 'O' ||
                c1 == 'U' ||
                c1 == 'a' ||
                c1 == 'e' ||
                c1 == 'i' ||
                c1 == 'o' ||
                c1 == 'u' 
            ){
                posicion.add(i);
            }
        }

        j=0;
        for(int i = 0; i<s.length(); i++){
            c1 = s.charAt(i);
            if(j<posicion.size()){
                if(i == posicion.get(j)){
                    c1 = s.charAt(posicion.get(posicion.size() - j -1));
                    j++;
                }
            }
            devolver += c1;
        }

        return devolver;
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        String cadena = String.valueOf(x);

        for(int i = 0; i<cadena.length()/2; i++){
            if(
                cadena.charAt(i) !=
                cadena.charAt(cadena.length()-i-1)
            ){
                return false;
            }
        }
        return true;
    }
}
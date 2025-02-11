class Solution {
    public int romanToInt(String s) {
        int caracter, anterior = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            caracter = getNumber(s.charAt(i));
            if (i == 0) {
                result = caracter;
                anterior = caracter;
            } else {
                if (caracter > anterior) {
                    result += caracter - anterior * 2;
                } else {
                    result += caracter;
                }
                anterior = caracter;
            }
        }

        return result;
    }

    public int getNumber(char n) {
        switch (n) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
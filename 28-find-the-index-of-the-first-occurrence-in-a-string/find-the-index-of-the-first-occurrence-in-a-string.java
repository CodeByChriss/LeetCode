class Solution {
    public int strStr(String haystack, String needle) {
        boolean encontrado = false;
        int index = 0;

        if (haystack.length() >= needle.length()) {
            for (int i = 0; i < haystack.length() && !encontrado; i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    for (int j = 0; j < needle.length(); j++) {
                        if (i+j < haystack.length() || i == 0) {
                            if (haystack.charAt(i + j) == needle.charAt(j)) {
                                if (j == needle.length() - 1) {
                                    index = i;
                                    encontrado = true;
                                }
                            } else {
                                j = needle.length();
                            }
                        }
                    }
                }
            }
        }

        if (encontrado)
            return index;
        else
            return -1;
    }
}
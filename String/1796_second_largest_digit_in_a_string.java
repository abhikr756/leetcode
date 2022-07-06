class Solution {
    public int secondHighest(String s) {
        int[] digits = new int[10];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 48 && c <= 57) {
                digits[c - 48]++;
            }
        }

        boolean maxFound = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] > 0) {
                if (maxFound) {
                    return i;
                } else {
                    maxFound = true;
                }
            }
        }

        return -1;
    }
}
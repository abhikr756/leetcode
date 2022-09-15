class Solution {
    public int minFlips(String target) {
     final int N = target.length();
        int count = 0;
        char prev = '0';
        for (int i = 0; i < N; i++) {
            char ch = target.charAt(i);
            if (ch != prev) {
                count++;
                prev = ch;
            }
        }
        return count;   
    }
}
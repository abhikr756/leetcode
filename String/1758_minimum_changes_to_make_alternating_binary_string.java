class Solution {
    public int minOperations(String s) {
      return Math.min(countFlips(s, '0'), countFlips(s, '1'));
    }

    int countFlips(String s, char next) {
        int count = 0;
        for(char c : s.toCharArray()) {
            if(next != c) {
                count ++;
            }
            next = (next == '0') ? '1' : '0';
        }
        return count;   
    }
}
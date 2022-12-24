class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0 && (n % 3 == 0 || (n - 1) % 3 == 0)) {
            if ((n - 1) % 3 == 0) n--;
            while (n > 0 && n % 3 == 0) {
                n /= 3;
            }
            if (n == 0) return true;
        }
        return false;
    }
}
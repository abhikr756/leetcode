class Solution {
    public String gcdOfStrings(String str1, String str2) {
         String d = str1.length() < str2.length() ? str1 : str2;
        int n = d.length();
        for (int i = 1; i <= n; i++) 
        {
            if (n % i != 0) continue;
            String sub = d.substring(0, n / i);
            if (str1.replaceAll(sub, "").equals("") && str2.replaceAll(sub, "").equals("")) {
                return sub;
            }
        }
        return "";
    }
}
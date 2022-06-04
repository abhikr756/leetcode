class Solution {
    public String convertToTitle(int columnNumber) {
      String result ="";
        while(columnNumber>0)
        {
            char ch = (char)(65 + (columnNumber-1)%26);
            result =ch + result;
            columnNumber = (columnNumber-1)/26;
        }
        return result;  
    }
}
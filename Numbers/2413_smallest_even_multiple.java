class Solution {
    public int smallestEvenMultiple(int n) {
     int temp=n;
        while(n>0)
        {
            if(n%2 == 0 && n%temp == 0){               
                return n;
            }
            n++;
        }
      return 0;     
    }
}
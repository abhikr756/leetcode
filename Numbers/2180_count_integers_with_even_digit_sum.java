class Solution {
    public int countEven(int num) {
        int count=0;
      for(int i=1;i<=num;i++)
      {
          int n=i;
          int sum=0,rem=0;
            while(n>0)
          {
             rem=n%10;
             sum=sum+rem;
             n=n/10;
          }
            if(sum%2==0)
              {
                  count++;
              }
      }
        return count;
    }
}

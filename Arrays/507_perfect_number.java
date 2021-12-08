class Solution {
    public boolean checkPerfectNumber(int num) {
       int sum=1;
        int mid = (int)Math.sqrt(num);
        if(num==1)
        {
            return false;
        }
        for(int i=2;i<=mid;i++)
        {
            if(num%i==0)
            {
                sum =sum+i;
                sum=sum+num/i;
                
            }
        }
        return sum==num;
    }
}